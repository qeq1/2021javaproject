package com.atguigu.set;

import org.junit.Test;

import java.time.format.TextStyle;
import java.util.LinkedHashSet;

/*

--LinkedHashSet
               有序：添加顺序
               唯一：元素唯一

 */
public class SetTest2 {


    @Test
    public void test01(){
        LinkedHashSet<String>  lhs = new LinkedHashSet<>();
        lhs.add("JAVA");
        lhs.add("HTML");
        lhs.add("PYTHON");
        lhs.add("PYTHON");
        lhs.add("HTML");
        lhs.add("CSS");


        System.out.println(lhs);

    }

    @Test
    public void test02(){
        LinkedHashSet<Person>  set = new LinkedHashSet<>();

        set.add(new Person("张三", 18));
        set.add(new Person("李四", 20));
        set.add(new Person("张三", 18));

        System.out.println(set);
    }


}
