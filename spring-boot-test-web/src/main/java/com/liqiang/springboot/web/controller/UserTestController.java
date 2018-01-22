package com.liqiang.springboot.web.controller;

import com.liqiang.springboot.module.domain.UserDO;
import com.liqiang.springboot.module.mapper.UserMapper;
import com.liqiang.springboot.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liqiang
 * @Date 2018/1/17
 **/
@RestController
@RequestMapping(produces = "application/json")
public class UserTestController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/userTest")
    @ResponseBody()
    public UserDO userTest(@RequestParam("id") Integer id) {
        return userService.getUser(id);
    }
    @RequestMapping(value="listAllUser")
    @ResponseBody
    public List<UserDO> listAllUser(){
        return userMapper.listUser(null);
    }

    @RequestMapping("helloWorld")
    @ResponseBody
    public String helloWorld(@RequestParam("string")String string){
        return "hello world "+string;
    }
}
