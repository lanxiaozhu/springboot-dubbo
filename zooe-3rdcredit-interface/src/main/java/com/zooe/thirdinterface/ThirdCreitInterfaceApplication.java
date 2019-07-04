package com.zooe.thirdinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//加载dubbo配置文件
@ImportResource({"classpath:dubbo/dubboConfig.xml"})
public class ThirdCreitInterfaceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ThirdCreitInterfaceApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
