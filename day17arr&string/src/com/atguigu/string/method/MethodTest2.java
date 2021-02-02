package com.atguigu.string.method;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MethodTest2 {

    @Test
    public void test01() {
        String mess = "hello";
        //判断是否包含指定的字符串
        boolean he = mess.contains("he1");
        System.out.println("he = " + he);

        /*
        查找指定元素第一次出现的下标
        下标 从 0开始
        元素不存在 返回 -1
         */
        int i = mess.indexOf("l");

        System.out.println(i);

        /*
        lastIndexOf();
        查找元素 最后一次出现 的下标
        不存在时  返回 -1
         */
        int l = mess.lastIndexOf("2");
        System.out.println("l = " + l);

        String result = "asdjoisadjisajdAKSODPKSAPDosaidjaisodjosajd12321saoiDPKJOJDSAP";
        /*
      新建一个空的字符串
      将不重复的字母 放到新字符串内
      再使用嵌套循环 找到每一个字母出现的次数
         */
    }

    @Test
    public void test02() {

        /*
        字符串的截取
         */

        String mess = "ABCDEF";

        String s = mess.substring(1);
        System.out.println("s = " + s);//BCDEF

        /*
        截取指定范围内的字符串
        [开始下标,结束下标);
         */
        String s2 = mess.substring(2, 5);
        System.out.println("s2 = " + s2);

    }

    @Test
    public void test03() {
        String mess = "ABCDEF";

        //获取指定位置的字符
        char c = mess.charAt(mess.length() - 1);
        System.out.println("c = " + c);

        //将字符串转为char数组
        char[] chars = mess.toCharArray();
        System.out.println(Arrays.toString(chars));

    }

    @Test
    public void test04() throws UnsupportedEncodingException {
        String mess = "ab";
        byte[] bytes = mess.getBytes();
        System.out.println("Arrays.toString(bytes) = " + Arrays.toString(bytes));
        byte[] messBytes = mess.getBytes("iso8859-1");
        System.out.println(Arrays.toString(messBytes));
        System.out.println(mess.getBytes("gbk").length);// 一个汉字 俩字节  4  2
        System.out.println(mess.getBytes("utf-8").length);// 一个汉字三个字节  6  2

    }
}
