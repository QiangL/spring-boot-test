package com.liqiang.springboot.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/
@SpringBootApplication
@PropertySource({"classpath:application-module.properties"})
@MapperScan("com.liqiang.springboot.module.mapper")
public class ModuleConfig {

    public static void main(String[] args) {
        SpringApplication.run(ModuleConfig.class, args);
    }
}
