package com.ujiuye.servlet;

import com.ujiuye.dao.UserDao;
import com.ujiuye.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String flag = request.getParameter("flag");
        UserDao ud = new UserDao();
        if("login".equals(flag)){
            //获取用户的账号秘密
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            User u = ud.login(username, password);
            //成功与否的判断
            if(u == null){
                //登录失败，回到登录页面
                response.sendRedirect("login.html");
            }else{
                //登录成功，进入首页面
                response.sendRedirect("index.html");
            }
        }else if("regist".equals(flag)){
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            int rows = ud.regist(username,password);
            if(rows == 0){
                response.sendRedirect("regist.html");
            }else{
                response.sendRedirect("login.html");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}