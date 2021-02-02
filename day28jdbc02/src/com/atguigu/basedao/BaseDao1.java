package com.atguigu.basedao;

import com.atguigu.utils.JDBCUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

public class BaseDao1 {

    //获取单个值
    public Object getSingleValue(String sql, Object... args) throws SQLException, IOException, ClassNotFoundException {
        //select count(*) from account;
        //1.获取连接
        Connection connection = JDBCUtils.getConnection();
        //2.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);
        //3.设置值
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
        }
        //4.执行命令获取结果
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {

            Object object = rs.getObject(1);
            return object;
        }




        //5.返回结果

        return null;


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

        System.out.println(connection);
        System.out.println(Thread.currentThread().getName());

        PreparedStatement pst = connection.prepareStatement(sql);

        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
        }
        int i = pst.executeUpdate();
        return i;

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


        List<T> all = getAll(clazz, sql, args);

        T t = all.get(0);


        return t;


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
        //创建存储所有数据 的集合
        List<T> list = new ArrayList<>();

        //获取连接 select * from account where id < ?;
        Connection connection = JDBCUtils.getConnection();
        //准备命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);

        //获取原数据
        ResultSetMetaData metaData = pst.getMetaData();

        //获取了一共有多少列
        int count = metaData.getColumnCount();


        //设置值
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
        }
        //执行命令 获取结果集
        ResultSet rs = pst.executeQuery();
        //遍历结果集获取数据
        while (rs.next()) {
            //使用反射创建对象
            T instance = clazz.newInstance();
            //获取字段名 再去获取对应的值
            for (int i = 0; i < count; i++) { //循环一次给一个属性赋值
                //获取字段名
                String columnLabel = metaData.getColumnLabel(i + 1);
                //获取对应的字段值
                Object value = rs.getObject(columnLabel);
                //获取对象对应的属性
                Field field = clazz.getDeclaredField(columnLabel);

                field.setAccessible(true);
                //将数据库中的值变为对象的属性值
                field.set(instance, value);
            }
            //将对象添加到 集合内
            list.add(instance);
        }
        return list;
    }

    /**
     * 通用的 没有实体类对应的方法
     *
     * @param sql
     * @param args
     * @return
     */
    public List<Map<String, Object>> mapToList(String sql, Object... args) throws SQLException, IOException, ClassNotFoundException {

        System.out.println(Arrays.toString(args));
        //1.创建集合
        List<Map<String, Object>> list = new ArrayList<>();

        //2.获取连接
        Connection connection = JDBCUtils.getConnection();

        //3.创建命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);


        //4.设置值
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
        }
        //5.获取原数据
        ResultSetMetaData metaData = pst.getMetaData();


        //获取一共有几个字段
        int count = metaData.getColumnCount();
        //6.执行命令获取结果
        ResultSet rs = pst.executeQuery();

        System.out.println("rs.getMetaData().getColumnCount() = " + rs.getMetaData().getColumnCount());

        //7.遍历结果集
        while (rs.next()) {
            //创建map 存储值
            Map<String, Object> map = new HashMap<>();

            for (int i = 1; i <= count; i++) {
                //获取字段的名字
                String columnLabel = metaData.getColumnLabel(i);
                //获取字段值
                Object value = rs.getObject(i);
                //8.将每一个值添加到map内
                map.put(columnLabel, value);
            }
            //9.将map添加到集合内
            list.add(map);
        }

        //10.关闭资源

        JDBCUtils.closeResources(connection, pst, rs);


        return list;
    }

}
