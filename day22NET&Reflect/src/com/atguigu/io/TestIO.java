package com.atguigu.io;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/*

System.out 默认输出到控制台
System.err 默认输出到控制台
可以通过 System.setOut(打印流); 改变流向
可以通过 System.setErr(打印流); 改变流向


 */
public class TestIO {


    @Test
    public void test02(){
        Scanner in = new Scanner(System.in);
        String next = in.next();
        System.out.println(next);
    }

    @Test
    public void test03() throws FileNotFoundException {

        Scanner in = new Scanner(new File("E:\\2021javaproject\\day06OOP1\\src\\Student.java"));

        while (in.hasNextLine()){
            String s = in.nextLine();
            System.out.println(s);
        }
        in.close();
    }
    @Test
    public void test01() throws FileNotFoundException {
        //打印流
        System.out.println("你好 世界");
        System.err.println("世界 我很好");

        //创建打印流
        PrintStream ps = new PrintStream("E:/p.txt");
        ps.println("鹅鹅鹅");
        ps.println("曲项向天歌");

        System.setOut(ps);


        System.out.println("哈哈哈");
        System.out.println("我是卖报");
        System.err.println("66666666666");
        ps.close();


    }
}
class Person{

    public static final String name = "你好";




}