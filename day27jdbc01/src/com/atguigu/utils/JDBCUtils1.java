package com.atguigu.utils;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/*
没有使用数据库连接池
 */
public class JDBCUtils1 {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        Connection connection = getConnection();
        System.out.println(connection);
    }

    static String user;
    static String url;
    static String password;

    static {
        /*
        类在初始化时 只会执行一次 静态代码块

        就完成了配置文件的加载  拿到了 用户名 等数据

         */
        Properties properties = new Properties();
        try {
            properties.load(JDBCUtils1.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            user = properties.getProperty("user");
            url = properties.getProperty("url");
            password = properties.getProperty("password");
            String driver = properties.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //1.获取连接
    public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {

        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


    //1.获取连接
    public static Connection getConnection1() throws ClassNotFoundException, SQLException {
        // 使用反射 触发了Driver类的初始化    里面有静态代码块完成了驱动的注册
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    //2.关闭资源
    public static void closeResources(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {

        if (connection != null) {
            connection.close();
        }
        if (statement != null) {
            statement.close();
        }

        if (resultSet != null) {
            resultSet.close();
        }
    }

}
