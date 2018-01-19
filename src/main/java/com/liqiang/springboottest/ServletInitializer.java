package com.liqiang.springboottest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 创建war包
 * https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-create-a-deployable-war-file
 * https://stormpath.com/blog/tutorial-spring-boot-war-files#setting-up-a-servlet
 */
public class ServletInitializer extends SpringBootServletInitializer {

    //TODO 尝试注掉这个类，看打war包的问题
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootTestApplication.class);
	}

}
