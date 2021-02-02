package com.atguigu.test;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.io.IOException;
import java.sql.*;

public class Test1 {

    @Test
    public void test01() throws SQLException, IOException, ClassNotFoundException {

        //1.注册驱动
        //2.获取连接
        Connection connection = JDBCUtils.getConnection();

        //3.准备sql
        String sql = "select id,sname name ,balance from account";
        //4.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);
        //获取 表头的数据

        ResultSetMetaData metaData = pst.getMetaData();
        //获取一共有几个字段
        int count = metaData.getColumnCount();

        for(int i = 0;i<count;i++){
            System.out.println("metaData.getColumnName(i+1) = " + metaData.getColumnName(i + 1));
            //可以获取别名
            System.out.println("metaData.getColumnLabel(i+1) = " + metaData.getColumnLabel(i + 1));
            System.out.println("metaData.getColumnClassName(i+1) = " + metaData.getColumnClassName(i + 1));

            System.out.println("metaData.getTableName(i+1) = " + metaData.getTableName(i + 1));

            System.out.println("---------------------------------\n\n");
        }

        System.out.println("count = " + count);

        //5.设置值
        //6.执行命令获取结果
        ResultSet rs = pst.executeQuery();

        //7.处理结果
        while (rs.next()) {
            //获取所有的记录

            Object o1 = rs.getObject(1);
            Object o2 = rs.getObject(2);
            Object o3 = rs.getObject(3);

            System.out.println(o1 + "-->" + o2 + "--->" + o3);


            //8.数据的封装
        }


        //9.关闭资源
        JDBCUtils.closeResources(connection, pst, rs);


    }
}
