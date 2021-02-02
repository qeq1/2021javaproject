package com.atguigu.review;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
    List<String> list = new ArrayList<>();

    @Before
    public void testBefore(){
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("李商隐");

    }

    @Test
    public void test04(){

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String ele = listIterator.next();

            System.out.println("listIterator==>"+ele);
        }

        //判断光标的前面是否有元素
        while (listIterator.hasPrevious()){// 必须要有 从前向后 才能 从后向前

            String ele = listIterator.previous();
            System.out.println("ele===>"+ele);
        }


    }


    @Test
    public void test03(){

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("迭代器："+next);
        }
    }
    @Test
    public void test02(){

        for (String s : list) {

            System.out.println("增强for:"+s);
        }


    }


    @Test
    public void test01(){
        for(int i = 0;i<list.size();i++){
            String ele = list.get(i);
            System.out.println(ele);
        }
    }
}
