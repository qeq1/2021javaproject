package com.atguigu.jdbctest01;

import org.junit.Test;

import java.sql.*;

public class Test02 {

    @Test
    public void test01() throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql:///test";
        Connection connection = DriverManager.getConnection(url, "root", "root");
        //3.创建命令发送器
        Statement statement = connection.createStatement();
        //4.准备sql
        String sql = "select * from users";
        //5.发送sql 获取结果
        //结果集 查询到的数据 都在结果集内
        ResultSet rs = statement.executeQuery(sql);

        // 返回true 则代表有【一条】记录
        /*
        rs.getObject(index); 通过下标的方式获取值
          rs.getObject(columnLabel);通过列名的方式获取值
         */
        while (rs.next()){
            //6.处理结果
            //获取id的值
            /*int anInt = rs.getInt(1);

            String sname = rs.getString(2);

            Object object = rs.getObject(3);*/

           /* int anInt = rs.getInt("id");

            String sname = rs.getString("sname");

            String object = rs.getString("pwd");*/

            Object anInt = rs.getObject("id");

            Object sname = rs.getObject("sname");

            Object object = rs.getObject("pwd");
            //7.输出数据
            System.out.println(anInt+"--->"+sname+"--->"+object);


        }


        //8.关闭资源
        rs.close();
        statement.close();
        connection.close();

    }

}
