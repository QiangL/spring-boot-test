package com.liqiang.springboot.module.mapper;

import com.liqiang.springboot.module.BaseTest;
import com.liqiang.springboot.module.domain.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liqiang (liqiang8@xiaomi.com)
 * @Date 2018/1/19
 **/
public class UserMapperTest extends BaseTest {
    private static Logger logger= LoggerFactory.getLogger(UserMapperTest.class);
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<UserDO> userDOS = userMapper.listUser(null);
        logger.error("error");
        logger.info("info");
        logger.warn("warn");
        Assert.assertNotNull(userDOS);
    }
}
