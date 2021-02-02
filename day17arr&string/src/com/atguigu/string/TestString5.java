package com.atguigu.string;

public class TestString5 {
    public static void main(String[] args) {


        String s = "hello";

        String s1 = "world";

        String s3 = "hello" + "world";

        String s4 = s + s1;

        String s5 = s + s1 + s3 + s4;

        System.out.println(s5);
    }
}
