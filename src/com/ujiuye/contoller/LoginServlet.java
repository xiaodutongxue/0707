package com.ujiuye.contoller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 登录的servlet
* */
//@WebServlet("asd")
public class LoginServlet  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前端请求传递的参数
              String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String hobby = req.getParameter("hobby");
        String adress = req.getParameter("adress");
        String Personal = req.getParameter("Personal");

        System.out.println(username+","+password+","+sex+","+hobby+","+adress+","+Personal);

        //响应内容到前端页面
        resp.getWriter().println("success");
    }


}
