package com.atguigu.string;

public class EmptyString {

    public static void main(String[] args) {
     /*   String s;
        System.out.println(s.length());*/
        String s1 = null;//java.lang.NullPointerException
        //System.out.println(s1.length());
        //空的字符串  有内容
        String s2 = "";//没有元素
        String s3 = " ";//元素是空格
        System.out.println(s2.length());

        System.out.println(s3.length());

        System.out.println("s2.isEmpty() = " + s2.isEmpty());

        System.out.println("s3.isEmpty() = " + s3.isEmpty());

        if (!s2.isEmpty()) {


        }
        if (s2.length() > 0) {


        }

    }
}
