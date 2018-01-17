package com.liqiang.springboottest.controller;

import com.liqiang.springboottest.domain.UserDO;
import com.liqiang.springboottest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqiang (liqiang8@xiaomi.com)
 * @Date 2018/1/17
 **/
@RestController
public class UserTestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/userTest")
    @ResponseBody
    public UserDO userTest(@RequestParam("id") Integer id) {
        UserDO userDO = userMapper.getUser(id);
        return userDO;
    }

    @RequestMapping("helloWorld")
    @ResponseBody
    public String helloWorld(){
        return "hello world";
    }
}
