package com.atguigu.jdbctest01;

import com.atguigu.bean.User;
import org.junit.Test;

import java.sql.*;
import java.util.Scanner;

public class Test03 {

    @Test
    public void test01() throws ClassNotFoundException, SQLException {

        Scanner in = new Scanner(System.in);

        System.out.println("请输入您的名字");//蔡旭坤
        String sname = in.next();
        System.out.println("请输入您的密码");
        String pwd = in.next();//456


        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接

        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");

        //3.创建命令发送器
        Statement statement = connection.createStatement();

        //4.准备sql

        String sql = "insert into users values(null,'" + sname + "','" + pwd + "')";

        //5.发送sql 获取结果

        int i = statement.executeUpdate(sql);


        //6.输出结果

        System.out.println(i > 0 ? "成功" : "失败");

        //7.关闭资源
        statement.close();
        connection.close();
    }

    @Test
    public void test02() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的名字");//蔡旭坤
        String sname = in.next();
        System.out.println("请输入您的密码");
        in.nextLine();
        String pwd = in.nextLine();//456


        User user = judgeUser(sname, pwd);

        if(user!=null){
            System.out.println(user);
        }else{
            System.out.println("查无此人");
        }


    }

    /**
     * 通过传入的用户名和密码 判断此用户存在还是不存在
     *
     * @param sname
     * @param pwd
     * @return 存在返回对象  不存在返回null
     */
    private User judgeUser(String sname, String pwd) throws Exception {

        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");
        //3.创建命令发送器
        Statement statement = connection.createStatement();
        //4.准备sql  2312' or '2'='2
        String sql = "select * from users where sname='" + sname + "' and pwd ='" + pwd + "'";

        System.out.println(sql);
        //5.发送sql 获取结果集
        ResultSet rs = statement.executeQuery(sql);

        //6.处理结果

        while (rs.next()){
            int id = rs.getInt(1);

            String name = rs.getString(2);

            String pwd1 = rs.getString("pwd");

            User user = new User(id, name, pwd1);


            return user;
        }

        //8.关闭资源

        rs.close();

        statement.close();
        connection.close();


        return null;
    }


}
