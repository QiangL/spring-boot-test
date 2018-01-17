package com.liqiang.springboottest;

import com.liqiang.springboottest.config.servlettest.FilterTest;
import com.liqiang.springboottest.config.servlettest.ServletTest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;
import javax.servlet.Servlet;

@SpringBootApplication
@MapperScan("com.liqiang.springboottest.mapper")
/**
 * 扫描servlet和filter，listener的
 */
@ServletComponentScan("com.liqiang.springboottest.config.servlettest")
public class SpringBootTestApplication implements ApplicationContextAware {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		for (String name:applicationContext.getBeanDefinitionNames() ) {
			System.out.println(">>>>>>>>>>>   bean name:" + name);
			//System.out.println(" >>>>>>:" + applicationContext.getBean(name).getClass().toString());
		}
	}
}
