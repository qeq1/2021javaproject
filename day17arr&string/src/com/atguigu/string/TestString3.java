package com.atguigu.string;

import org.junit.Test;

/*
栈

堆
1.8 元空间：
       直接使用物理内存  JVM的时候



 */
public class TestString3 {

    @Test
    public void test01() {
        String m1 = "hello";
        String m2 = "hello";
    /*
    String 系统类 已经完成了对 equals()重写 比较的是 内容
     */
        System.out.println(m1.equals(m2));
        System.out.println(m1 == m2);

    }

    @Test
    public void test02() {
        String m1 = "hello";
        String m2 = new String("hello");
        System.out.println(m1.equals(m2));//true
        System.out.println(m1 == m2);//false
    }

    @Test
    public void test03() {

/*

        Person p = new Person("李白", 20);
        Person p1 = null;
        Person p2;
*/

        String s1 = null;
        String s = "";
        String s2 = new String("");


      /*  String s;
        String s1 = null;
        String s = "";
        String s1 = new String();
        String s2 = new String("");

        String s = "abc";
        String s1 = new String("abc");

        char[] arr = {'a','b'};
        String s = new String(arr);

*/


        char[] arr = {'a','b','c','d','e'};
        String s5 = new String(arr,0,3);

    }
}
