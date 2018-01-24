package com.liqiang.springboot.service.service.impl;

import com.liqiang.springboot.module.domain.UserDO;
import com.liqiang.springboot.module.mapper.UserMapper;
import com.liqiang.springboot.service.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liqiang
 * @Date 2018/1/22
 **/
@Service
public class UserServiceImpl implements UserService {
    private static Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDO getUser(Integer id) {
        logger.debug("this is a debug");
        logger.info("this is a infi");
        logger.error("this is a error");
        return userMapper.getUser(id);
    }
}
