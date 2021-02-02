package com.atguigu.list;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList2 {
    List<String> list = new ArrayList<>();

    @Before
    public void testBefore() {
        list.add("蔡旭坤");
        list.add("陈坤");
        list.add("杨坤");
        list.add("谢广坤");
    }

    @Test
    public void test05(){
        list.forEach(System.out::println);
    }



    @Test
    public void test04() {
        /*
        listIterator:可以实现从后向前遍历
                     前提是需要先从前向后遍历  将光标放到最后
         */
        //创建ListIterator
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
          /*
          获取当前元素 前一个 下标
            System.out.println("listIterator.previousIndex() = " + listIterator.previousIndex());
           */
            String ele = listIterator.next();
            if(ele.equals("杨坤")){
                //删除元素
                //listIterator.remove();
                //可以进行新增元素
                listIterator.add("刘德华");
            }
            System.out.println("listIterator从前向后：" + ele);
            /*
              获取当前元素 后一个 下标
            System.out.println("listIterator.nextIndex() = " + listIterator.nextIndex());
             */

        }

        System.out.println(list);


/*
        //判断是否有前一个
        while (listIterator.hasPrevious()){


            String ele = listIterator.previous();//获取前一个数据

            System.out.println("listIterator从后向前:"+ele);


        }*/


    }

    @Test
    public void test03() {

        //创建iterator对象

        Iterator<String> iterator = list.iterator();
        //iterator.hasNext() 判断 光标的后面是否还有元素
        while (iterator.hasNext()) {

            //获取指定的元素
            String ele = iterator.next();
            System.out.println("迭代器遍历：" + ele);
        }

    }

    @Test
    public void test02() {
        /*

        for(集合元素的类型 标识符：集合的名字){
            标识符： 集合内的每一个元素
        }
         */
        for (String ele : list) {
            System.out.println("增强for循环：" + ele);
        }

    }

    @Test
    public void test01() {
        System.out.println("list.size() = " + list.size());
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println("普通for循环： " + ele);
        }


    }
}
