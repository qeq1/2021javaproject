package com.atguigu.string;
/*
java.lang.String;
  String类是一个final类 不能被继承
  String是不可变的字符序列
        任何一次操作产生的都是新对象
  String字符串的底层采用的是 final char[] 数组 存储数据
     jdk1.9 char[]===>byte[]



 */
public class TestString1 {

    public static void main(String[] args) {

        String mess = "你好";
               mess = "你好啊";

               mess = new String("哈哈");


    }

}
