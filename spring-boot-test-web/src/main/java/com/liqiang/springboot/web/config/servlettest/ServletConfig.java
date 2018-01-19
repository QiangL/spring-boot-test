package com.liqiang.springboot.web.config.servlettest;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextListener;

/**
 * @Configuration 声明RegistrationBean的方式
 * 或者@ServletComponentScan+@Web*的方式
 * 二选一即可
 * @author liqiang
 * @Date 2018/1/17
 **/
//@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean testServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new ServletTest());
        bean.addUrlMappings("/registrationPath/*");
        return bean;
    }
    @Bean
    public FilterRegistrationBean testFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new FilterTest());
        bean.addUrlPatterns("/registrationPath/*");
        return bean;
    }
    @Bean
    public ServletListenerRegistrationBean<ServletContextListener> testListener(){
        ServletListenerRegistrationBean<ServletContextListener> bean = new ServletListenerRegistrationBean<ServletContextListener>(new ListenerTest());
        return bean;
    }
}
