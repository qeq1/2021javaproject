package com.atguigu.data.linkedlisttest;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void test01(){
        //双端循环链表
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
    }
    @Test
    public void test02(){
        //LinkedList 新增了操作头尾的方法
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("李白");
        list.addLast("杜甫");


        System.out.println(list);
        //返回被删除的元素
        String s = list.removeFirst();
        System.out.println(s);

        System.out.println("---->"+list);


        String first = list.getFirst();
        System.out.println("first = " + first);

    }


}
