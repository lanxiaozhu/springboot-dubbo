package com.zooe.thirdcore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/dubboConfig.xml"})
@MapperScan("com.zooe.thirdcore.dao")
public class ThirdCreditCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdCreditCoreApplication.class, args);
    }

}
