package com.atguigu.dao;

import com.atguigu.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class BaseDao {

    QueryRunner query = new QueryRunner();

    //获取单个值
    public Object getSingleValue(String sql, Object... args) throws SQLException, IOException, ClassNotFoundException {
        //select count(*) from account;
        //1.获取连接
        Connection connection = JDBCUtils.getConnection();

        return query.query(connection, sql, new ScalarHandler<>(), args);

    }


    /**
     * 通用的增删改
     *
     * @param sql
     * @param args
     * @return
     * @throws SQLException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public int update(String sql, Object... args) throws SQLException, IOException, ClassNotFoundException {
        //1.获取连接  insert into account values(null,?,?);
        Connection connection = JDBCUtils.getConnection();
        return query.update(connection,sql, args);

    }


    /**
     * 获取单个对象
     *
     * @param clazz 对应的 Class信息
     * @param sql   查询的sql
     * @param args  参数
     * @param <T>   泛型类型
     * @return
     */
    public <T> T getOne(Class<T> clazz, String sql, Object... args) throws IllegalAccessException, NoSuchFieldException, IOException, InstantiationException, SQLException, ClassNotFoundException {
        return query.query(JDBCUtils.getConnection(), sql, new BeanHandler<>(clazz), args);
    }


    /**
     * 获取 查询的数据封装为集合
     *
     * @param clazz 对应类型的class对象
     * @param sql   要执行的sql
     * @param args  要传递的参数
     * @param <T>   具体的类型
     * @return
     */
    public <T> List<T> getAll(Class<T> clazz, String sql, Object... args) throws SQLException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        Connection connection = JDBCUtils.getConnection();

        return query.query(connection, sql, new BeanListHandler<>(clazz), args);
    }

    /**
     * 通用的 没有实体类对应的方法
     *
     * @param sql
     * @param args
     * @return
     */
    public List<Map<String, Object>> mapToList(String sql, Object... args) throws SQLException, IOException, ClassNotFoundException {




        return query.query(JDBCUtils.getConnection(), sql, new MapListHandler(), args);
    }

}
