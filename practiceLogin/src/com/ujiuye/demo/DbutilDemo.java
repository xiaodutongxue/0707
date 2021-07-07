package com.ujiuye.demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ujiuye.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbutilDemo<Emp> {

    QueryRunner qr = JdbcUtil.getQueryRunner();

   /* //查询所有
    public List<Emp> getAllEmp(){
        List<Emp> list = new ArrayList<Emp>();
        String sql = "select * from emp";
        try {
            list = qr.query(sql, new BeanListHandler<>(Emp.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }*/

   /* //根据主键查询
    public Emp getEmpByEmpno(int empno){
        Emp emp = null;
        String sql = "select * from emp where empno=?";
        try {
            emp = qr.query(sql, new BeanHandler<>(Emp.class), empno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }
*/
    //查询某表数据条数
    public int getCountRows(){
        int countRows = 0;
        String sql = "select count(*) from emp";
        try {
            countRows = (int)(long)qr.query(sql, new ScalarHandler());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countRows;
    }

   /* //新增
    public int addEmp(Emp e){
        int rows = 0;
        String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
        try {
            rows = qr.update(sql, e.getEmpno(), e.getEname(), e.getJob(), e.getMgr(),
                    e.getHiredate(), e.getSal(), e.getComm(), e.getDeptno());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rows;
    }*/

    //删除
    public int delEmpByEmpno(int empno){
        int rows = 0;
        String sql = "delete from emp where empno=?";
        try {
            rows = qr.update(sql, empno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    //修改
   /* public int updateEmp(Emp e){
        int rows = 0;
        String sql = "update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?";
        try {
            rows = qr.update(sql, e.getEname(), e.getJob(), e.getMgr(),
                    e.getHiredate(), e.getSal(), e.getComm(), e.getDeptno(), e.getEmpno());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rows;
    }
*/
    @Test
    public void t01(){
        /*List<Emp> list = getAllEmp();
        for (Emp emp:list){
            System.out.println(emp.getEname());
        }
        Emp emp = getEmpByEmpno(73);
        System.out.println(emp.getEname());
        int countRows = getCountRows();
        System.out.println(countRows);
        Emp emp = new Emp(1,"张三","程序员",7902,new Date(),2000,100,10);
        int rows = addEmp(emp);
        System.out.println(rows);
        int empno = 73;
        int rows = delEmpByEmpno(empno);
        System.out.println(rows);
        Emp emp = new Emp(7499,"李四","程序员",7902,new Date(),2000,100,10);
        int rows = updateEmp(emp);
        System.out.println(rows);*/
    }
}