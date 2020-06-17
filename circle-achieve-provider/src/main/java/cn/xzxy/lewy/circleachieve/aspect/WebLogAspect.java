package cn.xzxy.lewy.circleachieve.aspect;

import cn.xzxy.lewy.circleachieve.pojo.LogInterfaceWithBLOBs;
import cn.xzxy.lewy.circleachieve.service.InterfaceLogService;
import cn.xzxy.lewy.core.model.JsonResponseEntity;
import cn.xzxy.lewy.mvc.exception.BusinessException;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Aspect
@Component
@Slf4j
public class WebLogAspect {

    @Resource
    InterfaceLogService interfaceLogService;

    // 切入点（controller包的切入点）描述
    // 签名，可以理解成这个切入点的一个名称
    @Pointcut(value = "execution(* cn.xzxy.lewy.circleachieve.controller..*(..)) ")
    public void controllerLog() {
    }

    // 方法执行中
    @Around("controllerLog()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        // RequestContextHolder用于SpringMvc获得请求
        RequestAttributes requestAttributes = RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
        LogInterfaceWithBLOBs logRecord = new LogInterfaceWithBLOBs();
        logRecord.setLogId(UUID.randomUUID().toString().replaceAll("-", ""));
        logRecord.setInvokeMethod(pjp.getSignature().getName());
        logRecord.setClientIpaddr(request.getRemoteAddr());

        // 一个 Signature 示例：
        // JsonResponseEntity cn.controller.QuestionController.treatDetailDoc(TreatDetailDocReq)
        String methodName = pjp.getSignature().getName(); // treatDetailDoc
        Class<?> classTarget = pjp.getTarget().getClass();
        // 记录入参
        Class<?>[] par = ((MethodSignature) pjp.getSignature()).getParameterTypes();
        // JsonResponseEntity cn.controller.QuestionController.treatDetailDoc(TreatDetailDocReq)
        Method objMethod = classTarget.getMethod(methodName, par);
        // 记录类名
        logRecord.setInvokeClass(classTarget.getSimpleName());

        // 获取调用方法上的@OpLog
        OpLog opLog = objMethod.getAnnotation(OpLog.class);
        if (opLog != null) {
            logRecord.setInvokeName(opLog.methodName());
            logRecord.setInvokeMethod(opLog.methodCode());
        }

        Date kssj = new Date();// 开始时间
        Object ob = null;

        String method = request.getMethod();
        Object[] args = pjp.getArgs();
        if (args.length > 0) {
            if ("POST".equals(method)) {
                Map<String, Object> fieldsName = getFieldsName(pjp);
                String inParams = JSON.toJSONString(fieldsName);
                logRecord.setInParam(inParams);
            } else if ("GET".equals(method)) {
                String queryString = request.getQueryString();
                logRecord.setInParam(queryString);
            }
        }

        // 这样用try catch捕获方法执行时的异常，目的是记录调用的结果
        // 但是这样的话，try catch会在全局异常获取（@ExpectationHandler）前捕获前处理掉异常
        // 那么定义的BusinessException全局异常处理过程在这个切面的范围内就失效了
        try {
            ob = pjp.proceed();// ob 为方法的返回值
            JsonResponseEntity result = (JsonResponseEntity) ob;
            if (result != null) {
                logRecord.setInvokeState(result.getCode() == 200 ? "1" : "0");
            }
        } catch (BusinessException e) {
            // 多一个分支的原因：
            // 有时候为了区别异常来源，要求不同业务抛出异常时需指定一个独立的状态码，而不是统一的400
            log.error("", e);
            logRecord.setInvokeState("0");
            ob = JsonResponseEntity.buildBusinessError(e.getMessage(), e.getStatus());
        } catch (Exception e) {
            log.error("", e);
            logRecord.setInvokeState("0");
            ob = JsonResponseEntity.buildBusinessError(e.getMessage());
        }

        Date jssj = new Date();// 结束时间

        logRecord.setCreateTime(kssj);
        logRecord.setEndTime(jssj);
        logRecord.setOutParam(ob + "");

        int opNum = interfaceLogService.saveLog(logRecord);
        if (opNum <= 0) {
            throw new BusinessException("接口调用日志记录失败");
        }

        return ob;
    }


    private static Map<String, Object> getFieldsName(ProceedingJoinPoint joinPoint) {
        // 参数值
        Object[] args = joinPoint.getArgs();
        ParameterNameDiscoverer pnd = new DefaultParameterNameDiscoverer();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        String[] parameterNames = pnd.getParameterNames(method);
        Map<String, Object> paramMap = new HashMap<>(32);
        if (parameterNames != null) {
            for (int i = 0; i < parameterNames.length; i++) {
                Object arg = args[i];
                if (arg instanceof BindingResult ||
                        arg instanceof HttpServletRequest ||
                        arg instanceof HttpServletResponse ||
                        arg instanceof MultipartFile ||
                        arg instanceof MultipartFile[]) {
                    continue;
                }
                paramMap.put(parameterNames[i], args[i]);
            }
        }
        return paramMap;
    }

    // 方法执行后
    @AfterThrowing(pointcut = "controllerLog()", argNames = "exception", throwing = "exception")
    public void methodAfterThrowing(Exception exception) {
        LogInterfaceWithBLOBs log = new LogInterfaceWithBLOBs();
        log.setInvokeState("0");
        log.setOutParam(exception.getMessage());
    }

}
