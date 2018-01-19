package com.liqiang.springboot;


import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
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
