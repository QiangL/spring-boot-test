package com.liqiang.springboot.web.config.servlettest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liqiang
 * @Date 2018/1/17
 **/
// 不指定name的情况下，name默认值为类全路径
@WebServlet(value = "/servletTest/*",name = "testServlet")
public class ServletTest extends HttpServlet {
    private static Logger logger= LoggerFactory.getLogger(ServletTest.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        logger.info("servlet test do get");
        resp.getWriter().write("servlet test do get finish");
        resp.getWriter().flush();
    }
}
