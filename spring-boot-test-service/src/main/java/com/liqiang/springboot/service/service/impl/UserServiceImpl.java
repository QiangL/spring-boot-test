package com.liqiang.springboot.service.service.impl;

import com.liqiang.springboot.module.domain.UserDO;
import com.liqiang.springboot.module.mapper.UserMapper;
import com.liqiang.springboot.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liqiang
 * @Date 2018/1/22
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDO getUser(Integer id) {
        return userMapper.getUser(id);
    }
}
