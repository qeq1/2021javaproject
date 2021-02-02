package com.atguigu.utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*

保证 如果是同一个线程 那么 获取到的变量 是同一个

 */
public class JDBCUtils {
    static DataSource dataSource;
    //创建一个ThreadLocal
    static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    static {


        Properties properties = new Properties();
        try {
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            // System.out.println(properties);
            // 创建druid连接池  通过properties中的数据
            dataSource = DruidDataSourceFactory.createDataSource(properties);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //1.获取连接
    public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {

        Connection conn = threadLocal.get();

        if(conn==null){
            //如果当前线程内 没有 连接 再通过 数据库连接池创建连接
            conn =  dataSource.getConnection();
            //将创建的新连接 添加到 ThreadLocal内
            threadLocal.set(conn);
        }
        return conn;
    }

    //2.关闭资源
    public static void closeResources(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {

        if (connection != null) {
            connection.close();
            //关闭连接时 将 保存的内容移除
            threadLocal.remove();
        }
        if (statement != null) {
            statement.close();
        }

        if (resultSet != null) {
            resultSet.close();
        }
    }

}
