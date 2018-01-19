package com.liqiang.springboot.web.config.servlettest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author liqiang
 * @Date 2018/1/17
 **/
/**
 * value、urlPatterns、servletNames 三者必需至少包含一个,且 value 和 urlPatterns 不能共存，如果同时指定，通常忽略 value 的取值
 * 此外,注解形式无法显式指定顺序,一个小技巧是可通过类名(文件名)的字典序指定初始化执行顺序:https://www.tuicool.com/articles/qAfYRv
 * 或者就要编写web.xml,但是只需要编写<filter-mapping>部分即可:https://segmentfault.com/q/1010000003909250
 *
 * **/
@WebFilter(value = "/servletTest/*",filterName = "testFilter")
public class FilterTest implements Filter {
    private static Logger logger= LoggerFactory.getLogger(FilterTest.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("filter test init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("filter test filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.info("filter test destroy");
    }

}
