package com.liqiang.springboottest.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.http.WebStatFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

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
