package com.zooe.thirdcore.dao;

import com.zooe.thirdcommon.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: wishm
 * @Date: 2019/7/5 10:54
 * @Description:
 */
public interface UserDao {
    List<User> get();
}
