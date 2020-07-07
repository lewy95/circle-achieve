package cn.xzxy.lewy.circleachieve;

import cn.xzxy.lewy.framework.mvc.annotation.EnableSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lewy95
 **/
@EnableSwagger2
@SpringBootApplication
public class CircleAchieveConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleAchieveConsumerApplication.class, args);
    }
}
