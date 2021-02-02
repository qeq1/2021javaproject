package com.atguigu.wrapper;

public class Test2 {
    public static void main(String[] args) {
        //Integer 是int的包装类
        int a = 10;


        System.out.println(0b11);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //将一个10进制的数 转为 二进制
        String s = Integer.toBinaryString(11);
        System.out.println(s);
        //将一个10进制的数 转为 8进制
        String s1 = Integer.toOctalString(11);
        System.out.println("s1 = " + s1);
        String s2 = Integer.toHexString(11);
        System.out.println("s2 = " + s2);

    }
}
