package com.liqiang.springboot.service.service;

import com.liqiang.springboot.module.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
}
