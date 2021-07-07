package com.ujiuye.contoller.com.ujiuye.annservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 配置了注解就不需要在配置xml
 * 即注解和xml的配置对一个Servlet只需要存在一个即可
 * 一个Servlet可以配置多个路径
 * 路径的匹配规则主要有三种:
 *  1. 完全匹配: 如: /aa  /bb  /cc/dd  浏览器地址输入相对路径地址和 urlPattern  中给定的地址完全一致
 *  2. 带父路径的统配地址: /aa/*   表示匹配aa父路径下所有请求的路径
 *  3. 完全通配符匹配 : /*   所有请求都会拦截
 *  对于路径匹配: 完全优先级高于 通配符
 *
 *  4. 后缀路径匹配:   *.do  *.html *.aa   匹配所有以 .XX 结尾的请求
 *
 *  路径匹配的优先级:  以斜线开始的 路径匹配优先与 后缀路径匹配
 *
 */
//@WebServlet("/ann")
//@WebServlet(urlPatterns = {"/demo","/ann","/three"},loadOnStartup = 0)
//@WebServlet("/*")
@WebServlet({"*.do"})
public class AnnServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("提供处理请求的服务");
    }
}
