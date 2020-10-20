package cn.xzxy.lewy.circleachieve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.xzxy.lewy.circleachieve.mapper")
public class CircleAchieveProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleAchieveProviderApplication.class, args);
    }

}
