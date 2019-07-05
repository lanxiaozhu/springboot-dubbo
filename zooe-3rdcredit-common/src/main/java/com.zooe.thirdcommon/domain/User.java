package com.zooe.thirdcommon.domain;

import java.io.Serializable;

/**
 * @Auther: wishm
 * @Date: 2019/7/4 16:56
 * @Description:
 */
public class User implements Serializable {
    private int id;
    private int userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }
}
