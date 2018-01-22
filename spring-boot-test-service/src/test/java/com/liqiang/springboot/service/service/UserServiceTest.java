package com.liqiang.springboot.service.service;

import com.liqiang.springboot.module.domain.UserDO;
import com.liqiang.springboot.service.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTest{

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        UserDO userDO = userService.getUser(1);
        Assert.assertNotNull(userDO);
    }
}
