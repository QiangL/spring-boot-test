package com.liqiang.springboot.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/
@SpringBootApplication
@MapperScan("com.liqiang.springboot.module.mapper")
public class ModuleConfig {

    public static void main(String[] args) {
        SpringApplication.run(ModuleConfig.class, args);
    }
}
