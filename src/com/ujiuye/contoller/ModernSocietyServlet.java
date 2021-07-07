package com.ujiuye.contoller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ModernSocietyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 方法 ");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post 方法 ");
       /* req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String flag = req.getParameter("flag");
        LoginServlet ls = new LoginServlet();
        if("login".equals(flag)){
            //获取用户的账号秘密
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            LoginServlet l = ls.login(username, password);
            //成功与否的判断
            if(l == null){
                //登录失败，回到登录页面
                resp.sendRedirect("login.html");
            }else{
                //登录成功，进入首页面
                resp.sendRedirect("index.html");
            }
        }else if("regist".equals(flag)){
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            int rows = ls.regist(username,password);
            if(rows == 0){
                resp.sendRedirect("regist.html");
            }else{
                resp.sendRedirect("login.html");
            }
        }*/
    }
}
