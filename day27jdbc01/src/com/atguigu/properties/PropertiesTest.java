package com.atguigu.properties;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {


    @Test
    public void test01() {
        //获取系统的配置信息
        Properties properties = System.getProperties();
        //输出所有的配置信息
        //properties.list(System.out);

        String value = properties.getProperty("file.encoding");

        System.out.println("value = " + value);
    }


    @Test
    public void test02() throws IOException {
        //写出数据到磁盘
        Properties pro = new Properties();
        pro.setProperty("user", "root");
        pro.setProperty("pwd", "123");

        System.out.println(pro);

        pro.store(new FileOutputStream(new File("D:/e.properties")), "this is test");

    }

    @Test
    public void test03() throws IOException {


        //1.新建Properties对象

        Properties pro = new Properties();

        pro.load(new FileInputStream(new File("D:/e.properties")));
        System.out.println(pro);
    }

}
