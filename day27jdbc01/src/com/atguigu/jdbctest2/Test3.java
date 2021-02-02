package com.atguigu.jdbctest2;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test3 {
/*
com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: You have an error in your SQL syntax;

You have an error in your SQL: 自己的sql 写错了


开启事务 ： 通过连接开启

        connection.setAutocommit(false);

        connection.rollback();//回滚

        connection.commit();//提交
 */

    @Test
    public void test01() {
        Connection connection = null;
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");

            //开启事务
            connection.setAutoCommit(false);
            //3.准备sql
            String sql1 = "update account set balance = balance - 500 where sname = '李白'";
            String sql2 = "update account set balance = balance + 500 where sname = '杜甫'";
            //4.创建命令发送器
            pst1 = connection.prepareStatement(sql1);

            pst2 = connection.prepareStatement(sql2);

            //6.执行sql 获取结果

            pst1.executeUpdate();
            pst2.executeUpdate();

            connection.commit();
            //7.输出结果
            System.out.println("转账成功");


        } catch (ClassNotFoundException | SQLException e) {
            //程序一旦出现了 异常 要 将数据进行还原
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println(e.getMessage());
            // e.printStackTrace();
        } finally {
            //8.关闭资源

            try {
                JDBCUtils.closeResources(connection, pst1, null);
                JDBCUtils.closeResources(null, pst2, null);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
