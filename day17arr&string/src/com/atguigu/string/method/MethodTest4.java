package com.atguigu.string.method;

import org.junit.Test;

/*
正则：独立的语言
    文本校验
    判断输入的文本是否满足要求

    []:代表一个字符


    [a-z]：小写字母[a-z]任何一个都可以
    +: 一个或者多个
    *： 0个或多个
    ？：0个或1个
    [^a]:代表匹配不是a的数据
    ^:代表什么开始

    $:以什么结尾


    \d: 代表任意一个数字 0-9
    \w: 代表字母和数字 以及下划线
 */
public class MethodTest4 {

    @Test
    public void test01(){
        String mess = "abc";
        boolean matches = mess.matches("[a-z]+");
        System.out.println("matches = " + matches);
    }

    @Test
    public void test02(){
        String m1  ="z";
        boolean matches = m1.matches("[^a]");
        System.out.println("matches = " + matches);
    }

    @Test
    public void test03(){
        String s = "01";
        boolean matches = s.matches("\\d+");//  \d
        System.out.println("matches = " + matches);
    }
    @Test
    public void test04(){
        String s = "_";
        boolean matches = s.matches("\\w");
        System.out.println("matches = " + matches);
    }

    @Test
    public void test05(){
        //匹配手机号
        // 13 5 7 8 45678
        String ss = "13699175108";
        boolean matches = ss.matches("1[3578]\\d{9}");
        System.out.println("matches = " + matches);
    }
}
