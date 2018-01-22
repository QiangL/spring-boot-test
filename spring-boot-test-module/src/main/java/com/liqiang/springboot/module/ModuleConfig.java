package com.liqiang.springboot.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/
@SpringBootApplication
@PropertySource("classpath:application-module.properties")
@MapperScan("com.liqiang.springboot.module.mapper")
public class ModuleConfig {

}
