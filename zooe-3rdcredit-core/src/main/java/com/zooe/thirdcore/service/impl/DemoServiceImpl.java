package com.zooe.thirdcore.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zooe.thirdapi.service.test.DemoService;

/**
 * @Auther: wishm
 * @Date: 2019/5/21 10:03
 * @Description:
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String demoHello() {
        return "mmp hello World";
    }
}
