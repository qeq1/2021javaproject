package com.atguigu.string;

import org.junit.Test;

public class TestString4 {
    @Test
    public void test01() {
        String s1 = "hello";//字符串变量 s1 ---> "hello"在常量池中的位置
        String s2 = "world";//字符串变量 s2 ---> "world"在常量池中的位置
        String s3 = "hello" + "world"; //常量 + 常量 ==>常量
        String s4 = "helloworld";//helloworld 字符串常量
        String s5 = s1 + s2;//  变量 + 变量   在堆中
        String s6 = s1 + "world";//变量 + 常量 在堆中

        System.out.println(s3 == s4);//true

        System.out.println(s5 == s4);//false

        System.out.println(s6 == s5);//false
        System.out.println(s6 == s4);//false
    }


    @Test
    public void test02() {
        String s1 = "hello";//字符串变量 s1 ---> "hello"在常量池中的位置
        String s2 = "world";//字符串变量 s2 ---> "world"在常量池中的位置
        String s3 = "hello" + "world"; //常量 + 常量 ==>常量
        String s4 = "helloworld";//helloworld 字符串常量
        String s5 = new String("helloworld");
        System.out.println(s4 == s5);//false
        //equals比较的是内容
        System.out.println(s4.equals(s5));//true
    }

    @Test
    public void test03() {
        final String s1 = "hello";// 常量
        final String s2 = "world";// 常量
        String s3 = "hello" + "world"; //常量 + 常量 ==>常量
        String s4 = "helloworld";//helloworld 字符串常量
        String s5 = s1 + s2;// 常量 + 常量
        String s6 = s1 + "world"; //常量 + 常量
        System.out.println(s3 == s4);//true
        System.out.println(s4 == s5);//true
        System.out.println(s3 == s5);//true
        System.out.println(s6 == s4);//true
    }

    @Test
    public void test04() {

        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1 + s2;
        String s5 = s1 + "world";



        System.out.println(s4 == s3);
        System.out.println(s5 == s3);

        String hello = new String("hello");


        System.out.println(hello == s1);//false
        //hello.intern() 调用此方法 会将数据直接存到常量池
        System.out.println(hello.intern() == s1);//true

    }

    @Test
    public void test05() {
        String s = "hello";
        for (int i = 0; i < 100; i++) {
            s += i;
            System.out.println(s);
        }

    }

}
