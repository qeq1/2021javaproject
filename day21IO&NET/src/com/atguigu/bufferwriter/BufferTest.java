package com.atguigu.bufferwriter;

import org.junit.Test;

import java.io.*;

/*
缓冲字符流：
  --缓冲字符输入流
    BufferedReader
    底层有一个char类型的数组 存储 缓冲的数据  8192
    br.readLine(); 一次读取一行数据  当么有数据时 返回 null

  --缓冲字符输出流
    BufferedWriter
     底层有一个char类型的数组 存储 缓冲的数据 8192
      bw.newLine();新建一行
 */
public class BufferTest {
    @Test
    public void test02() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:/w.txt"));

        bw.write("鹅鹅鹅");
        //bw.write("\n");
        bw.newLine();
        bw.write("曲项向天歌");
        bw.newLine();
        bw.write("白毛浮绿水");


        bw.close();

    }



    @Test
    public void test01() throws IOException {

        //新建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("E:/作文.txt"));

        String s = br.readLine();

        System.out.println(s);
        s = br.readLine();

        System.out.println(s);
        s = br.readLine();

        System.out.println(s);
        s = br.readLine();

        System.out.println(s);
        s = br.readLine();

        System.out.println(s);
        s = br.readLine();

        System.out.println(s);
        s = br.readLine();

        System.out.println(s);

        br.close();


    }
}
