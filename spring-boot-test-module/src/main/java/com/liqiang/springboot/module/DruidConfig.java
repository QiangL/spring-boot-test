package com.liqiang.springboot.module;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Druid配置
 * @author liqiang
 * @Date 2018/1/16
 **/
@Configuration
public class DruidConfig {
    
    private static Logger logger= LoggerFactory.getLogger(DruidConfig.class);


    @Bean
    @Primary
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
