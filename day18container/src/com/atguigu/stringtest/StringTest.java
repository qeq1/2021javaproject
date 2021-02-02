package com.atguigu.stringtest;

import org.junit.Test;

/*

String 是不可变的字符序列 涉及到 字符串的改变 会创建大量的对象

     --StringBuffer  一个是线程安全的  效率低

        底层是采用char类型的数组存储数据  char数组 默认长度是 16
     --StringBuilder  线程不安全的     效率高
       可变的字符序列
        底层是采用char类型的数组存储数据  char数组 默认长度是 16

   共同点：
      他们的父亲都是 AbstractStringBuilder  抽象类
 */
public class StringTest {
    @Test
    public void test01() {


        StringBuffer sbf = new StringBuffer();

        sbf.append(10);
        /*
         public synchronized StringBuffer append(int i) {
        toStringCache = null;
        super.append(i);
        return this;
    }
         */
        //  StringBuilder sbr = new StringBuilder(200);
        StringBuilder sbr = new StringBuilder("你好");
        sbr.append(20);

    }

    @Test
    public void test02() {
        //不可变的字符序列 String
        //StringBuffer 是可变的
        //他们的方法都是一样的
        String s = "";

        StringBuffer sbf = new StringBuffer("今 天真开心");

        //append 在原有字符串的末尾进行追加
        StringBuffer buffer = sbf.append(10).append(20).append(88);

        System.out.println(buffer);

        int length = buffer.length();

        System.out.println(buffer);
        buffer.setLength(60);
        System.out.println("-----------------------------------------------");
        System.out.println(buffer);
        System.out.println(buffer.length());

    }

    @Test
    public void test04() {
        //  StringBuffer sbf = new StringBuffer("今开天真开心");
        StringBuilder sbf = new StringBuilder("今开天真开心");
        //返回指定元素第一次出现的下标
        int index = sbf.indexOf("开");
        System.out.println(index);
        int lastIndexOf = sbf.lastIndexOf("开");
        System.out.println("lastIndexOf = " + lastIndexOf);

        //将指定元素 添加到指定的位置
        sbf.insert(1, "哈哈");//今哈哈开天真开心
        System.out.println(sbf);
        //删除的时候下标范围[开始下标,结束下标)；
        sbf.delete(1, 3);
        System.out.println(sbf);           //今开天真开心
        //删除了指定位置的字符
        sbf.deleteCharAt(0);
        System.out.println(sbf);//开天真开心

        //设置指定位置的字符
        sbf.setCharAt(0, '乐');

        System.out.println(sbf);//乐天真开心

    }
}
