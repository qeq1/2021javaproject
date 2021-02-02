package com.atguigu.datastream;

import org.junit.Test;

import java.io.*;

/*
数据流：
   可以保留数据的原始特性 int
   以二进制的形式存储数据  人看不懂

  只有字节流 没有字符流

 */
public class DataStreamTest {

    @Test
    public void test01() throws IOException {
        //新建数据流对象
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:/d.txt"));
        //写出数据
        dos.writeInt(10);
        dos.writeBoolean(false);
        dos.writeUTF("你好");
        //关闭资源
        dos.close();
    }
    @Test
    public void test02() throws IOException {
        //1.新建数据输入流对象读取数据
        DataInputStream dis = new DataInputStream(new FileInputStream("E:/d.txt"));

        //2.读取

        int i = dis.readInt();
        System.out.println(i);


        boolean b = dis.readBoolean();
        System.out.println(b);

        String s = dis.readUTF();
        System.out.println(s);
        //3.关闭流
        dis.close();

    }
}
