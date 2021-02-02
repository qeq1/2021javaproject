package com.atguigu.stream;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;

/*

字节流： 所有的数据 都可以采用 字节流进行传输

--字节输入流
    InputStream
--字节输出流
    1.OutputStream  抽象类  需要借助子类实现功能
    可以将数据写到 磁盘上 还可以进行网络传输
    2.  FileOutputStream() 直接作用到 文件上 是一个节点流
    3. 使用FileOutputStream 写出数据时 会将原有数据清空 保留 写出的数据
    4.  使用FileOutputStream 写出数据时 如果目标文件不存在的 直接创建一个文件
        只能是一级目录

    5. 写出字节数组
       write(数组,开始下标,数量);

    6.在原有数据后进行追加
       append : true 可以进行追加
       FileOutputStream("路径",boolean append);

    7.写出字符串
      byte[] b =  字符串对象.getBytes();







 */
public class OutStreamTest1 {

    @Test
    public void test01() throws FileNotFoundException {
        //创建字节输出流对象 方式1
        File file = new File("D:/a.txt");
        OutputStream os = new FileOutputStream(file);
        System.out.println("-----------------------------------------");
        //创建字节输出流对象 方式2
        OutputStream os1 = new FileOutputStream("D:/a.txt");


        new HashMap<>().put(1, 2);
    }

    @Test
    public void test02() throws IOException {

        //1.创建输出流对象
        OutputStream os1 = new FileOutputStream("D:/a.txt");

        //2.写出数据
        os1.write(66);
        os1.write(65);
        os1.write(98);
        //3.关闭资源
        System.out.println("执行完毕");
        os1.close();

    }

    @Test
    public void test03() throws IOException {
        //1.创建输出流对象

        OutputStream os = new FileOutputStream("E:/e.txt");
        //2.写出数据


        String s = "同九年，汝何秀";
        //写出字节数组
        byte[] bytes = s.getBytes();
        //os.write();
        os.write(bytes);
        //3.关闭资源

        os.close();


    }

    @Test
    public void test04() throws IOException {
        //1.创建对象
        //多态
        OutputStream os = new FileOutputStream("e:/e.txt");
        //2.写出数据

        byte[] bytes = {97, 98, 99, 100};
        //  os.write(bytes);
/*
  os.write(写出数据的数组, 开始下标, 写出的数量);
 */
        os.write(bytes, 1, 2);
        //3.关闭资源
        System.out.println("写出完毕");
        os.close();

    }

    @Test
    public void test05() throws IOException {
//1.创建输出流对象
    OutputStream os = new FileOutputStream("E:/e.txt",true);
        //2.写出数据

        String n = "\n";
        os.write(n.getBytes());

        String mess = "是的很真开心";

        os.write(mess.getBytes());

        //3.关闭资源

        os.close();


    }


}
