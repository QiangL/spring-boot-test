package com.liqiang.module.mapper;

import com.liqiang.module.BaseTest;
import com.liqiang.springboot.module.domain.UserDO;
import com.liqiang.springboot.module.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liqiang (liqiang8@xiaomi.com)
 * @Date 2018/1/19
 **/
public class UserMapperTest extends BaseTest{
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<UserDO> userDOS = userMapper.listUser(null);
        Assert.assertNotNull(userDOS);
    }
}
