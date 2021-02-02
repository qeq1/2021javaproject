package com.atguigu.jdbctest01;

import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {
    @Test
    public void test01() throws SQLException {
        //0.添加jar
        //1.注册驱动
        DriverManager.registerDriver(new Driver());
        //2.建立连接
        // 要使用 jdbc连接mysql  地址是 本机 端口号为3306 的 test库
        String url = "jdbc:mysql://localhost:3306/test";
        //用户名
        String user = "root";
        //密码
        String password = "root";
        //获取连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.创建命令发送器
        Statement statement = connection.createStatement();

        //4.准备sql
         //insert into users values(null,"杜甫","123456");
        String sql = "insert into users values(null,'李白','1234')";

        //5.执行sql 获取结果
        int i = statement.executeUpdate(sql);

        //6.输出结果
        System.out.println(i);
        //7.关闭资源
        statement.close();
        connection.close();
    }


    @Test
    public void test02() throws ClassNotFoundException, SQLException {
        //修改一条记录

        //1.注册驱动
        // 使用反射 触发了Driver类的初始化    里面有静态代码块完成了驱动的注册
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.创建命令发送器

        Statement statement = connection.createStatement();
        //4.准备sql
        String sql  ="update users set pwd = '123' where id =1";

        //5.发送sql 获取结果
        int i = statement.executeUpdate(sql);
        //6.输出结果

        System.out.println(i>0?"修改成功":"修改失败");

        //7.关闭资源

        statement.close();

        connection.close();

    }


    @Test
    public void test03() throws SQLException {
        /*
        1. 如果对应的驱动下 有 meta-inf services - 对应的驱动报名 则可以不用手动注册

        2.如果连接的是本地的mysql  则url : jdbc:mysql:///数据库名

        3.执行的如果是 增  删  改 操作 则都是用 executeUpdate(sql);

         */
        //1.注册驱动  SPI  service provider interface
        //2.建立连接
        String url = "jdbc:mysql:///test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.创建命令发送器
        Statement statement = connection.createStatement();
        //4.准备sql
        String sql = "delete from users where id = 1";
        //5.发送sql获取结果
        int i = statement.executeUpdate(sql);

        //6.输出结果
        System.out.println(i>0?"成功":"失败");

        //7.关闭资源

        statement.close();

        connection.close();






    }


}
