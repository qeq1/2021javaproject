package com.atguigu.writerreader;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
字符输出流：
  Writer 抽象类 FileWriter
  一次输出一个字符

  注意：
     1.字符输出流内部有一个缓冲区 写出数据时 先将数据写到缓冲区内

     2.将数据写到磁盘中
        字符输出流对象.flush();
        关闭资源 也会将缓冲区的数据 刷出到磁盘上











 */
public class WriterTest {

    @Test
    public void test01() throws IOException {
        //1.创建输出流对象
        Writer writer = new FileWriter("E:/e.txt");
       // File file = new File("E:/e.txt");
        Writer writer1 = new FileWriter(new File("E:/e.txt"));
        //2.输出数据
        //3.关闭流

    }


    @Test
    public void test02() throws IOException {
        //1.创建输出流对象
        Writer writer = new FileWriter("E:/w.txt");
        //2.输出数据
        writer.write(97);
        writer.write("今天真开心啊");
         writer.flush();
        //3.关闭资源
        writer.close();
        System.out.println("写出完毕");
    }

    @Test
    public void test03() throws IOException {
        //1.创建字符输出流对象
        Writer writer = new FileWriter("E:/w.txt");
        //2.输出数据
        char[] ch = {'今','天','真','开','心'};

        //写出所有内容
        //writer.write(ch);
        writer.write(ch, 1, 2);
        //3.关闭资源
        writer.close();




    }
}
