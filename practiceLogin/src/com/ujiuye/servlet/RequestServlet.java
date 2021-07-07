package com.ujiuye.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 请求行

包含：请求方式，请求的资源，协议及其版本
* */

@WebServlet("/requestServlet")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //获取请求行中的内容
        //获取请求方式
        System.out.println(request.getMethod());
        //获取资源路径
        System.out.println(request.getRequestURI());
        //获取全路径
        System.out.println(request.getRequestURL());
        //获取协议及其版本
        System.out.println(request.getProtocol());
        //获取IP
        System.out.println(request.getServerName());
        //获取端口号
        System.out.println(request.getServerPort());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
