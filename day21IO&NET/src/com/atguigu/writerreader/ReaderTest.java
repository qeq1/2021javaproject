package com.atguigu.writerreader;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/*
字符输入流：
  Reader  抽象类 通过子类来实现功能

  注意：
     1.使用 字符输入流读取数据时  存储数据的文件编码类型 要与代码编辑器的类型的一致
     2.字符输入流每次读取一个字符的数据  如果没有数据了 返回 -1

     3.字符输入流没此读取一个字符数组时  返回 数组内有效数据的个数
        如果已经读取完毕  则 返回-1

 */
public class ReaderTest {

    @Test
    public void test01() throws FileNotFoundException {
        Reader reader = new FileReader(new File("e:/w.txt"));
        Reader reader1 = new FileReader("E:/w.txt");
    }

    @Test
    public void test02() throws IOException {
        //1.创建字符输入流对象
        Reader reader = new FileReader("E:/w.txt");
        //2.读取数据
        int read = reader.read();
        System.out.println((char) read);//97  a
        int read1 = reader.read();
        System.out.println((char) read1);//65533
        int read2 = reader.read();
        System.out.println((char) read2);//65533
        int read3 = reader.read();
        System.out.println((char) read3);//65533
        int read4 = reader.read();
        System.out.println(read4);//-1
        //3.关闭资源
        reader.close();
    }

    @Test
    public void test03() throws IOException {
        //1.创建字符输入流对象
        Reader reader = new FileReader("E:/w.txt");
        //2.读取数据

     /*   while (true){
            int read = reader.read();
            //输出数据
            System.out.println((char)read+"---> "+ read);
            if(read==-1){
                break;
            }
        }*/

        int len = 0;
        while ((len = reader.read()) != -1) {
            System.out.println((char) len + "----> " + len);
        }
        //关闭资源

    }

    @Test
    public void test05() throws IOException {
        //1.创建 字符输入流对象
        Reader reader = new FileReader("E:/w.txt");

        //2.读取数据
        char c[] = new char[4];
        System.out.println(Arrays.toString(c));
        int read = reader.read(c);
        System.out.println("--->" + read);
        System.out.println(Arrays.toString(c));
        System.out.println("----------------------------------------");
        System.out.println(Arrays.toString(c));
        //读取char类型的数组时  返回 数组内有效元素的个数
        read = reader.read(c);
        System.out.println("--->" + read);
        System.out.println(Arrays.toString(c));
        System.out.println("----------------------------------------");
        read = reader.read(c);
        System.out.println("--->" + read);
        System.out.println(Arrays.toString(c));
        //3.关闭资源

        reader.close();
    }


    @Test
    public void test06() throws IOException {
        //1.新建输入流对象
        Reader reader = new FileReader("e:/w.txt");
        //2.读取数据 采用 字符数组
        //新建字符数组
        char c[] = new char[20];
/*
        //第一次读
        int len = reader.read(c);
        while (len!=-1){
            String s = new String(c, 0, len);
            //输出数据
            System.out.println(s);
            //继续读
            len = reader.read(c);
        }*/
        int len = 0;
        while ((len = reader.read(c)) != -1) {
            String s = new String(c, 0, len);
            //输出数据
            System.out.println(s);
        }
        //3.关闭资源
        reader.close();
    }
}
