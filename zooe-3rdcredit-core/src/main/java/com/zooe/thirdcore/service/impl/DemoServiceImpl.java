package com.zooe.thirdcore.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zooe.thirdapi.service.test.DemoService;
import com.zooe.thirdcommon.domain.User;
import com.zooe.thirdcore.dao.UserDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: wishm
 * @Date: 2019/5/21 10:03
 * @Description:
 */
@Component
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {


    @Resource
    private UserDao userDao;
    @Override
    public List<User> demoHello() {


        return userDao.get();
    }
}
