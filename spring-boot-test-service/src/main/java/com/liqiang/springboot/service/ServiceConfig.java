package com.liqiang.springboot.service;

import com.liqiang.springboot.module.ModuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/
@SpringBootApplication(scanBasePackages = "com.liqiang.springboot")
@PropertySource({"classpath:application-service.properties"})
@ImportAutoConfiguration(ModuleConfig.class)
public class ServiceConfig {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfig.class, args);
    }
}
