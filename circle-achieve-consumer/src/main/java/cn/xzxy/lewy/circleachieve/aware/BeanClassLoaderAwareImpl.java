package cn.xzxy.lewy.circleachieve.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

/**
 * @author zhang xiao
 * @since 1.0.0 (2020/3/11 1:09)
 **/
@Slf4j
@Component
public class BeanClassLoaderAwareImpl implements BeanClassLoaderAware {
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        log.debug("[] BeanClassLoaderAware");
    }
}
