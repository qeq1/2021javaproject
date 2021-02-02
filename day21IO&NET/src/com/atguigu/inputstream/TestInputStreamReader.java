package com.atguigu.inputstream;

import jdk.nashorn.internal.parser.Scanner;
import org.junit.Test;

import java.io.*;
import java.util.Stack;

/*
转换流：
   将 字节流 转为 字符流
   inputStreamReader
   OutputStreamWriter




 */
public class TestInputStreamReader {

    @Test
    public void test01() throws IOException {

        FileReader reader = new FileReader("E:/kk.txt");

        int read = reader.read();
        // 当前idea 是UTF-8编码  读取 GBK的编码
        System.out.println((char) read);

        reader.close();
    }

    @Test
    public void test02() throws IOException {
        //使用GBK的编码方式 读取 gbk编码的文件
        InputStreamReader reader = new InputStreamReader(new FileInputStream("E:/kk.txt"), "GBK");
        int read = reader.read();
        System.out.println((char) read);
        reader.close();
    }


    @Test
    public void test03() throws IOException {

        // new Scanner(System.in);

        InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(reader);

        System.out.println("请您输入数据");
        //int read = reader.read();
        // System.out.println((char)read);

        String s = br.readLine();
        System.out.println(s);
    }

    @Test
    public void test04() throws IOException {
        // System.out.println(999);

        OutputStreamWriter writer = new OutputStreamWriter(System.out);

        writer.write("你好");
        writer.flush();
        writer.close();

        FileOutputStream stream = new FileOutputStream("E:/oo.txt");
        OutputStreamWriter w = new OutputStreamWriter(stream, "GBK");
        w.write(97);
        w.close();


    }


}
