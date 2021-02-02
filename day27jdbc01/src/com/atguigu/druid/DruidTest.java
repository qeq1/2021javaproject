package com.atguigu.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import java.sql.SQLException;

/*
德鲁伊 数据库连接池


 */
public class DruidTest {

    @Test
    public void test01() throws SQLException {
        //0.导入jar包
        //1.创建对象
        DruidDataSource ds = new DruidDataSource();

        //2.进行配置
        //基本配置
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setUrl("jdbc:mysql:///test");
        ds.setDriverClassName("com.mysql.jdbc.Driver");

        //连接池配置
        ds.setInitialSize(5);//连接池初始化5条连接

        ds.setMaxActive(10);//最多可以有几个连接

        ds.setMaxWait(2000);//最多等待时间


        //3.获取连接

       /* DruidPooledConnection connection = ds.getConnection();

        System.out.println(connection);*/


        for (int i = 0; i < 20; i++) {


            DruidPooledConnection connection = ds.getConnection();

            System.out.println(connection+"-->"+(i+1));

            connection.close();


        }

    }


}
