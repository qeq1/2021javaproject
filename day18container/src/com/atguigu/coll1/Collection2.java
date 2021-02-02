package com.atguigu.coll1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class Collection2 {

    @Test
    public void test01() {
        Collection c1 = new ArrayList();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(new Date());
        for (Object obj : c1) {
            System.out.println(obj);
        }
        System.out.println("=================================");
       //创建一个迭代器
        Iterator iterator = c1.iterator();
        //hasNext() 判断游标/光标的后面是否还有数据  有 ===> true 无---》false
        //next() 拿到指定的数据
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }

    @Test

    public void test02(){

        A a = new A();

        for (Object o : a) {
        }
    }
    @Test
    public void test03(){
        //在遍历数组时  没有使用Iterator
        int[] arr = {10,20};
        for (int i : arr) {
            System.out.println(i);
        }

    }
}

class A implements Iterable{

    @Override
    public Iterator iterator() {
        return null;
    }
}
