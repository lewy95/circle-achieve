package cn.xzxy.lewy.circleachieve.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author zhang xiao
 * @since 1.0.0 (2020/3/10 17:26)
 **/
@Slf4j
@Component
public class ApplicationContextAwareImpl implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.debug("[] ApplicationContextAware");
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            log.debug("beanName: [{}]", beanDefinitionName);
            if("TimeDemoApi".equals(beanDefinitionName)) {
                Object o =  applicationContext.getAutowireCapableBeanFactory().getBean(beanDefinitionName);
                log.debug(">>> {}",o.getClass());
            }


        }
    }
}
