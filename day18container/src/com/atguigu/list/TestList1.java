package com.atguigu.list;

import org.junit.Test;

import java.time.Period;
import java.util.*;

/*

Collection  无序 不唯一

     List    有序 ：添加的顺序
             不唯一：可以添加重复元素
         ArrayList
           数组
         LinekdList
           链表

 */
public class TestList1 {


    @Test
    public void test01() {

        Collection c = new ArrayList();


        //多态
        List<String> list = new ArrayList<>();

        list.add("蔡旭坤");
        list.add("陈坤");
        list.add("杨坤");
        list.add("谢广坤");
        System.out.println(list);
        list.add(2, "刘能");
        System.out.println(list);


        List<String> l1 = new ArrayList<>();


        l1.add("杜甫");
        l1.add("王安石");

        // list.addAll(l1);

        //添加到指定位置
        list.addAll(0, l1);
        System.out.println("==>" + list);
    }


    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        list.add("蔡旭坤");
        list.add("陈坤");
        list.add("杨坤");
        list.add("谢广坤");
        //通过下标获取指定的元素
        String ele = list.get(2);
        System.out.println("ele = " + ele);
        boolean b = list.contains("谢广坤");
        System.out.println("b = " + b);
    }

    @Test
    public void test03() {

        List<String> list = new ArrayList<>();
        list.add("蔡旭坤");
        list.add("陈坤");
        list.add("杨坤");
        list.add("谢广坤");

        //删除指定元素
        // list.remove("陈坤");
        //删除指定下标的元素
        list.remove(0);
        System.out.println(list);

    }

    @Test
    public void test04() {

        List<String> list = new LinkedList<>();
        list.add("蔡旭坤");
        list.add("陈坤");
        list.add("杨坤");
        list.add("谢广坤");

        list.set(1, "哈哈哈");

        System.out.println(list);
    }

    @Test
    public void test05() {
        List<String> list = new ArrayList<>();
        list.add("蔡旭坤");
        list.add("陈坤");
        list.add("杨坤");
        list.add("谢广坤");

        System.out.println("list.size() = " + list.size());

        System.out.println("list.isEmpty() = " + list.isEmpty());

        list.clear();
        System.out.println("list = " + list);


    }

    @Test
    public void test06() {
        List<String> list = new ArrayList<>();
        list.add("杨坤");
        list.add("蔡旭坤");
        list.add("陈坤");
        list.add("杨坤");
        list.add("谢广坤");
        list.add("杨坤");
        System.out.println(list);
        //返回指定元素第一次出现的下标
        int index = list.indexOf("杨坤");
        System.out.println("index = " + index);
        //返回指定元素最后一次出现的下标
        int lastIndexOf = list.lastIndexOf("杨坤");
        System.out.println("lastIndexOf = " + lastIndexOf);
        //获取一个子集合  [开始下标,结束下标)
        List<String> l2 = list.subList(1, 3);
        System.out.println(l2);


    }

    @Test
    public void test07() {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Object[] objects = list.toArray();
        //new String[]{} 类型数组对象
        String[] array = list.toArray(new String[]{});

        for (String s : array) {

            System.out.println(s.toLowerCase());
        }

    }
}

class Student {


}

class Person {
    Student s1;


}
