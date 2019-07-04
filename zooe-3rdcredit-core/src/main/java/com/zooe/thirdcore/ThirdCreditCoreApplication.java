package com.zooe.thirdcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/dubboConfig.xml"})
public class ThirdCreditCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdCreditCoreApplication.class, args);
    }

}
