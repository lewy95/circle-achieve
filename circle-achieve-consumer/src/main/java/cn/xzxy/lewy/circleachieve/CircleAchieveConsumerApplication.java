package cn.xzxy.lewy.circleachieve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @author lewy95
 **/
@SpringBootApplication
public class CircleAchieveConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleAchieveConsumerApplication.class, args);
    }
}
