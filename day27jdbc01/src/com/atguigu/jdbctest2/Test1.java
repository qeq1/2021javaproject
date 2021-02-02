package com.atguigu.jdbctest2;

import com.atguigu.bean.User;
import org.junit.Test;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

/*
 1. sql的拼接

 2.sql注入的危险

 3.处理 blob数据


使用预编译对象
 */
public class Test1 {

    @Test
    public void test01() throws ClassNotFoundException, SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的名字");//蔡旭坤
        String sname = in.next();
        System.out.println("请输入您的密码");
        String pwd = in.next();//456

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");
        //3.准备sql
        String sql = "insert into users values(null,?,?)";

        //4.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);
        //5.填充数据
        //pst.setObject(第几个？ 从1开始, sname);
        pst.setObject(1, sname);
        pst.setObject(2, pwd);
        //6.执行sql 获取结果
        int i = pst.executeUpdate();
        //7.输出结果

        System.out.println(i > 0 ? "成功" : "失败");

        //8.关闭资源

        pst.close();

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

        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("查无此人");
        }


    }

    private User judgeUser(String sname, String pwd) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");
        //3.准备sql
        String sql = "select * from users where sname = ? and pwd = ?";
        //4.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);
        //5.填充数据
        pst.setObject(1, sname);
        pst.setObject(2, pwd);

        //6.执行查询 获取结果集
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            //7.处理结果

            int id = rs.getInt(1);

            String name = rs.getString(2);
            String password = rs.getString(3);

            //8.封装对象
            User user = new User(id, name, password);

            return user;


        }
        //9.关闭资源
        rs.close();
        pst.close();
        connection.close();


        return null;

    }

    @Test
    public void test03() throws ClassNotFoundException, SQLException, IOException {
        /*
        Packet for query is too large (161636789 > 4194304).
        You can change this value on the server by setting the max_allowed_packet' variable

        1.存储图片了 将数据类型设置为 blob类型  64K
        2.  longblob 4G
        3.mysql单次上传的数据最大为4兆  可以在 my.ini中进行修改   max_allowed_packet
        以后会有专门的图片服务器 保存图片
         */
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接

        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");

        //3.准备sql
        String sql = "insert into photo values(null,?)";
        //4.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);

        //5.添加数据

       // InputStream is = new FileInputStream(new File("C:\\图片\\小数二进制存储运算过程.png"));
        InputStream is = new FileInputStream(new File("C:\\Users\\user\\Desktop\\分享\\111\\裴师骄\\1\\11.mpg"));

        pst.setBlob(1, is);
        //6.执行sql 获取结果

        int i = pst.executeUpdate();

        //7.输出结果
        System.out.println(i>0?"成功":"失败");

        //8.关闭资源

        is.close();

        pst.close();

        connection.close();


    }

    @Test
    public void test04() throws ClassNotFoundException, SQLException {
        //获取自动增长的键值

        //1.注册驱动

        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接

        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");


        //3.准备sql

        String sql = "insert into users values(null,?,?)";
        //4.创建命令发送器
        //PreparedStatement pst = connection.prepareStatement(sql);
        // 获取自动增长的key值 Statement.RETURN_GENERATED_KEYS
        PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        //5.添加数据
        pst.setObject(1, "蔡旭坤");
        pst.setObject(2, "123");

        //6.执行命令 获取结果

        int i = pst.executeUpdate();

        //7.输出结果
        System.out.println(i>0?"成功":"失败");

        //获取自动增长的key值 存到 结果集内
        ResultSet generatedKeys = pst.getGeneratedKeys();

        if(generatedKeys.next()){

            Object object = generatedKeys.getObject(1);
            System.out.println(object);

        }


        pst.close();

        connection.close();








    }


}
