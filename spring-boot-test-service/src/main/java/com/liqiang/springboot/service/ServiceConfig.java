package com.liqiang.springboot.service;

import com.liqiang.springboot.module.ModuleConfig;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/
@SpringBootApplication
@PropertySource({"classpath:application.properties"})
@ImportAutoConfiguration(ModuleConfig.class)
public class ServiceConfig {

}
