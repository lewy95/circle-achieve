package cn.xzxy.lewy.circleachieve.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author zhang xiao
 * @since 1.0.0 (2020/3/11 1:07)
 **/
@Slf4j
@Component
public class EnvironmentAwareImpl implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        log.debug("[] EnvironmentAware");
    }
}
