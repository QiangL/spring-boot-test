package com.liqiang.springboot.service.service;

import com.liqiang.springboot.module.domain.UserDO;
import com.liqiang.springboot.service.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTest{
    private static Logger logger= LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        UserDO userDO = userService.getUser(1);
        logger.error("error");
        logger.info("info");
        logger.warn("warn");
        Assert.assertNotNull(userDO);
    }
}
