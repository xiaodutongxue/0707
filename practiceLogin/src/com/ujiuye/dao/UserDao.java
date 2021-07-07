package com.ujiuye.dao;



import com.ujiuye.entity.User;
import com.ujiuye.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {

    QueryRunner qr = JdbcUtil.getQueryRunner();

    //登录
    public User login(String username, String password){
        User user = null;
        String sql = "select * from student where username=? and password=?";
        try {
            user = qr.query(sql, new BeanHandler<>(User.class), username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    //注册
    public int regist(String username,String password){
        int rows = 0;
        String sql = "insert into student(username,password) values(?,?)";
        try {
            rows = qr.update(sql, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

}