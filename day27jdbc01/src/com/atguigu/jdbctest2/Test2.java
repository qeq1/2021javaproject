package com.atguigu.jdbctest2;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test2 {
    /*
    批量添加数据
    批处理
     */

    @Test
    public void test01() throws ClassNotFoundException, SQLException {
        long startTime = System.currentTimeMillis();
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");

        //3.准备sql

        String sql = "insert into users values(null,?,?)";

        //4.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);

        for (int i = 0; i < 10000; i++) {
            //5.填充数据
            pst.setObject(1, "李白"+i);
            pst.setObject(2, "pwd"+i);
            //6. 执行命令 获取结果
            pst.executeUpdate();

        }

        //7.输出时间
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime-startTime));//19714
        //8.关闭资源
        pst.close();
        connection.close();

    }


    @Test
    public void test02() throws Exception{
        /*

        告诉 mysql服务器 开启 批处理的支持
        ?rewriteBatchedStatements=true

          pst.addBatch(); 将任务赞到一起

           pst.executeBatch();执行批处理
         */


        long startTime = System.currentTimeMillis();
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test?rewriteBatchedStatements=true", "root", "root");

        //3.准备sql

        String sql = "insert into users values(null,?,?)";

        //4.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);

        for (int i = 0; i < 10000; i++) {
            //5.填充数据
            pst.setObject(1, "李白"+i);
            pst.setObject(2, "pwd"+i);
            //6. 执行命令 获取结果
           //将数据攒到一块
            pst.addBatch();

        }
        pst.executeBatch();

        //7.输出时间
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime-startTime));//19628  1141
        //8.关闭资源
      /*  pst.close();
        connection.close();*/
        JDBCUtils.closeResources(connection, pst, null);
    }

}
