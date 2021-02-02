package com.atguigu.string.method;

import org.junit.Test;

import java.util.Arrays;

public class MethodTest1 {

    @Test
    public void test01(){

        int [] arr = {1,2};
        System.out.println(arr.length);
        String mess = "你好";
        System.out.println(mess.length());

        String s2 = "world";
        String s3 = mess+s2;

        String s5 = "你好world";

        System.out.println("s3 = " + s3);
        String s4 = mess.concat(s2);

        System.out.println("s4 = " + s4);
        System.out.println(s5==s4);//false

    }

    @Test
    public void test02(){
        String s = "ABCdef";

        String s1 = s.toUpperCase();
        System.out.println("s1 = " + s1);

        String s2 = s.toLowerCase();
        System.out.println("s2 = " + s2);

        String s3 = "abcDEF";
        System.out.println(s3.equals(s));//false
        //忽略大小写的比较
        boolean b = s3.equalsIgnoreCase(s);
        System.out.println("b = " + b);//true


    }

    @Test
    public void test03(){
        String m1 = "a";
        String m2 = "c";
        System.out.println(m1.compareTo(m2));
        System.out.println(m2.compareTo(m1));
        String[] arr = {"z","a","c","d"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test04(){

        //trim()去除字符串两端的空格


        String s = "  A  B  C  ";

        System.out.println("---"+s+"---");

        String trim = s.trim();
        System.out.println("---"+trim+"---");


    }
}
