package com.liqiang.springboottest.config.servlettest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author liqiang
 * @Date 2018/1/17
 **/
@WebListener
public class ListenerTest implements ServletContextListener {
    private static Logger logger= LoggerFactory.getLogger(ListenerTest.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("listener init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
