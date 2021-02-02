package com.atguigu.test;

import com.atguigu.basedao.BaseDao;
import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Test2 {

    @Test
    public void test01(){


        String sql1 = "update account set balance = balance - 500 where id =1";
        String sql2 = "update account set balance = balance + 500 what id =2";

        BaseDao baseDao = new BaseDao();
        Connection connection = null;

        try {
            connection = JDBCUtils.getConnection();

            System.out.println("test01connection"+connection+",线程名："+Thread.currentThread().getName());

            connection.setAutoCommit(false);

            baseDao.update(sql1, null);
            baseDao.update(sql2, null);

            connection.commit();

        } catch (Exception e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }



    }
}
