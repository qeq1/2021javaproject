package com.atguigu.data;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class MySingleWayListTest {

    @Test
    public void test03() {
        MySingleWayList<String> my = new MySingleWayList<>();
        my.add("你好");
        my.add("哈哈哈哈");
        my.add("世界");
        my.remove("你好");
        System.out.println(my);
    }


    @Test
    public void test02() {

        String[] aa = {"实际", "你好", "哈哈"};

        String s = Arrays.toString(aa);
        System.out.println(s);

        LinkedList l = new LinkedList();

        l.add(10);
        l.addLast("你好");


        System.out.println(l);
    }

    @Test
    public void test01() {
        MySingleWayList<String> my = new MySingleWayList<>();

        System.out.println("my.size() = " + my.size());
        my.add("你好");
        my.add("哈哈哈哈");
        my.add(null);
        my.add("世界");
        System.out.println(my.size());
        System.out.println(my);
    }
}
