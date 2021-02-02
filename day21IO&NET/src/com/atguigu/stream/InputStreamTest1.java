package com.atguigu.stream;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/*
字节输入流：
   InputStream 抽象类 通过子类 FileInputStream 实现功能
   1.创建字节输入流对象
       File file = new File("E:/a.txt");
        InputStream is = new FileInputStream(file);

        InputStream is1 = new FileInputStream("e:/a.txt");

   2.读取数据
        输入流对象.read(); //获取对应字符的编码值

        当读到-1的时候 文件内的资源已经读取完毕。

   3.注意：
      一次读取一个字节  不能一次读一个汉字 可以使用字节数组完成



 */
public class InputStreamTest1 {

    @Test
    public void test01() throws FileNotFoundException {

        File file = new File("E:/a.txt");
        InputStream is = new FileInputStream(file);

        System.out.println("----------------------------------------");
        //多态
        InputStream is1 = new FileInputStream("e:/a.txt");

    }

    @Test
    public void test02() throws Exception {
        //1.创建字节输入流对象
        InputStream is = new FileInputStream("E:/a.txt");
        //2.读取数据
        int read0 = is.read();
        //2.1输出数据
        System.out.println((char) read0);//97  a
        int read1 = is.read();
        System.out.println((char) read1);//49 1
        int read2 = is.read();
        System.out.println((char) read2);
        int read3 = is.read();
        System.out.println((char) read3);


        int read = is.read();

        System.out.println(read);

        //3.关闭流
        is.close();
    }

    @Test
    public void test03() throws IOException {
        //1.创建输入流对象
        FileInputStream fis = new FileInputStream("e:/a.txt");
        //2.读取数据
       /* while (true) {
            int read = fis.read();

            if (read == -1) {
                break;
            }
            //输出数据
            System.out.println((char) read);
        }*/


      /*  int len = fis.read();
        while (len != -1) {
            System.out.println((char) len);
            len = fis.read();
        }*/


        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }
        //3.关闭资源
        fis.close();
    }

    @Test
    public void test05() throws IOException {

        //1.创建输入流对象
        InputStream is = new FileInputStream("E:/a.txt");

        //2.读取数据
        byte[] b = new byte[8];
        System.out.println(Arrays.toString(b));
        //将数据读取到数组内  返回的是有效数据的个数
        int read = is.read(b);
        System.out.println(Arrays.toString(b));

        String s = new String(b);
        System.out.println(s);
        System.out.println("--->"+read);

        System.out.println("----------------------------------");
        read = is.read(b);

        String s1 = new String(b, 0, read);
        System.out.println(s1);
        System.out.println("--->"+read);

        System.out.println("----------------------------------");
        read = is.read(b);
        System.out.println("====>"+read);
        System.out.println(Arrays.toString(b));
        //3.关闭资源
        is.close();

    }

    @Test
    public void test06() throws IOException {

        //1.新建字节输入流
        InputStream is = new FileInputStream("E:/a.txt");

        //2.新建一个字节数组
        byte b[] = new byte[4];
      /*  int len = is.read(b);
        while (len!=-1){

            String s = new String(b, 0, len);
            //3.输出数据
            System.out.println(s);
            len = is.read(b);
        }*/

      int len = 0;

      while ((len=is.read(b))!=-1){
          String s = new String(b, 0, len);
          System.out.println(s);
      }
        //4.关流
        is.close();
    }

    @Test
    public void test07() throws IOException {

        InputStream is = new FileInputStream("E:/cc.txt");

        //一次读取一个字节的数据  -128 127
        int read = is.read();


        System.out.println((char)read);


        is.close();

    }





}
