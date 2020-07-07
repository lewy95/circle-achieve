package cn.xzxy.lewy.circleachieve.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author zhang xiao
 * @since 1.0.0 (2020/3/11 1:10)
 **/
@Slf4j
@Component
public class BeanNameAwareImpl implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        log.debug("[] BeanNameAware");
    }
}
