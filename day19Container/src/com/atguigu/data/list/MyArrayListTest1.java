package com.atguigu.data.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListTest1 {
    @Test
    public void test01(){
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(90);




        System.out.println(l);

        MyArrayList<String> list = new MyArrayList<>();
        list.add("你好");
        list.add("世界");
        list.add(null);
        System.out.println(list);
        int size = list.size();

        System.out.println(size);


        int index = list.getIndex(null);

        System.out.println(index);

    }

    @Test
    public void test02(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("你好");
        list.add("世界");
        list.add(null);
       // list.remove(1);
        list.remove("世界111");
        System.out.println(list);


    }

    @Test
    public void test03(){

        MyArrayList<String> list = new MyArrayList<>();
        list.add("你好");
        list.add("世界");
        list.add(null);
        String s = list.indexOf(2);
        System.out.println(s);
        list.clear();
        System.out.println(list);
    }

    @Test
    public void test04(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("你好");
        list.add("世界");
        list.add(null);
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){


            String next = iterator.next();

            System.out.println(next);
        }

    }
}
