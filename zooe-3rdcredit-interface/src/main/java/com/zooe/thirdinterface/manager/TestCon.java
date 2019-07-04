package com.zooe.thirdinterface.manager;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zooe.thirdapi.service.test.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wishm
 * @Date: 2019/5/20 17:13
 * @Description:
 */
@RestController
public class TestCon {

    @GetMapping("/get")
    public String get(){
        return "hello World !!! ";
    }

    @Reference(version  = "1.0.0")
    private DemoService demoService;

    @GetMapping("/getDuboo")
    public String getDuboo(){
        return demoService.demoHello();
    }
}
