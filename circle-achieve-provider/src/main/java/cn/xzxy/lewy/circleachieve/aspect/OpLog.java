package cn.xzxy.lewy.circleachieve.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义一个日志注解，标注在方法上，用于在切面生成时获取调用的方法名
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OpLog {
 
	/**
	 * 操作方法
	 */
	String methodCode();
 
	/**
	 * 操作名称
	 */
	String methodName();
 
}
