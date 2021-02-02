package com.atguigu.utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Connection c = getConnection();
        System.out.println(c);
    }
   static DataSource dataSource;
    static {


        Properties properties = new Properties();
        try {
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            System.out.println(properties);
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
        Connection connection = dataSource.getConnection();
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
