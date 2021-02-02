package com.atguigu.string;

import org.junit.Test;

/*
创建String对象的方式



 */
public class TestString2 {


    @Test
    public void test01() {


        //1.
        String mess = "你好";
        //2.
        char c[] = {'a', 'b'};
        String s = new String(c);
        System.out.println(s);

        String s5 = new String(c, 0, 1);

        System.out.println("===>" + s5);

        //3.
        String s1 = new String("世界");

        System.out.println(s1);
        //4.创建一个空的字符串""
        String s2 = new String();//""
        System.out.println("===" + s2 + "==");

        //5. 注意会将byte类型中 数字解析为对应的字符
        byte[] bytes = {65, 66, 67, 97};
        String s3 = new String(bytes);
        System.out.println(s3);
        /*
        new String(byte类型的数组, 开始的下标, 获取几个元素)
         */
        String s4 = new String(bytes, 1, 2);
        System.out.println(s4);

    }

    @Test
    public void test02(){


        int a = 10;
        String s1 = ""+a;
        String s = String.valueOf(a);

        System.out.println("s = " + s);
        char c[]  = {'a','b','c'};
        String s2 = String.valueOf(c, 1, 2);

        System.out.println("s2 = " + s2);
        String s3 = String.copyValueOf(c);
        System.out.println("s3 = " + s3);
    }
}
