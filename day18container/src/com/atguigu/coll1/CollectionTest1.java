package com.atguigu.coll1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
集合：【存储】多个数据的 长度不固定
数组： 数组的长度是固定的


Collection
         无序  不唯一

   List : 有序 添加的顺序
          不唯一  可以添加重复的元素
          ArraysList
          LinkedList

   Set：
         无序  不是按照添加的顺序输出
         唯一 不可以添加重复元素
        HashSet
        LinkedHashSet
        TreeSet


 */
public class CollectionTest1 {

    @Test
    public void test01() {
        //多态
        Collection coll1 = new ArrayList();

        //添加元素
        coll1.add(10);//Integer.vauleOf(10);

        coll1.add(20);


        // coll1.add(new Date());

        System.out.println(coll1);


        Collection c2 = new ArrayList();

        c2.add("张三");

        c2.add("李四");
/*


add(添加元素的) 会将一个集合作为一个元素处理

addAll(添加集合) 会将集合中的每一个元素 进行单独处理
 */

        coll1.add(c2);

        coll1.addAll(c2);
        //[10, 20, 张三, 李四]
        System.out.println(coll1);//[10, 20, [张三, 李四]]
        //判断集合内有多少数据
        System.out.println(coll1.size());//4


    }

    @Test
    public void test02(){
        Collection coll1 = new ArrayList();
        //添加元素
        coll1.add(10);//Integer.vauleOf(10);
        coll1.add(20);


        Collection c2 = new ArrayList();

        c2.add(66);

        c2.add(88);

        coll1.addAll(c2);

        System.out.println(coll1);


        //判断指定元素是否在集合内
        boolean contains = coll1.contains(101);
        System.out.println("contains = " + contains);

        //删除集合内的指定元素
        boolean remove = coll1.remove(10);
        System.out.println("remove = " + remove);
        //删除集合
        coll1.removeAll(c2);
        System.out.println(coll1);

    }

    @Test
    public void test03(){

        Collection c1 = new ArrayList();

        c1.add(10);
        c1.add(20);
        c1.add(30);

        Collection c2 = new ArrayList();

        c2.add(10);
        c2.add(30);
        //求交集
        c1.retainAll(c2);
        System.out.println(c1);

    }

    @Test
    public void test04(){

        Collection c1 = new ArrayList();

        c1.add(66);
        c1.add(new Date());
        c1.add("哈哈哈");
        System.out.println(c1);
        //判断集合是否为空
        System.out.println("c1.isEmpty() = " + c1.isEmpty());
        System.out.println("c1.size() = " + c1.size());

        //清除集合内所有的元素
        c1.clear();

        System.out.println("-----------------------------------");
        System.out.println(c1);
        //判断集合是否为空
        System.out.println("c1.isEmpty() = " + c1.isEmpty());
        System.out.println("c1.size() = " + c1.size());


    }


}
