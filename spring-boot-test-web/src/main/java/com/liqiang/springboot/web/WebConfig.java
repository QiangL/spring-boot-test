package com.liqiang.springboot.web;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/

import com.liqiang.springboot.service.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = "com.liqiang.springboot")
/**
 * 扫描servlet和filter，listener的
 */
@ServletComponentScan("com.liqiang.springboot.web.config.servlettest")
@ImportAutoConfiguration(ServiceConfig.class)
@PropertySource({"classpath:application-web.properties"})
public class WebConfig {

    public static void main(String[] args) {
        SpringApplication.run(WebConfig.class, args);
    }
}
