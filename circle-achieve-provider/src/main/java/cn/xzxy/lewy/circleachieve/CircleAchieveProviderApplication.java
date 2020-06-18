package cn.xzxy.lewy.circleachieve;

import cn.xzxy.lewy.framework.mvc.annotation.EnableSwagger2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2
@SpringBootApplication
@MapperScan("cn.xzxy.lewy.circleachieve.mapper")
public class CircleAchieveProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleAchieveProviderApplication.class, args);
    }

}
