package com.atguigu.data.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Vector;

/*
Vector 是 jdk早期的集合实现类
       线程安全的 synchronized
       在创建Vector 时 数组的长度就已经指定  10
       当容量不足的时候 进行扩容  如果 capacityIncrement 不是0  则增长为
            原有容量 + capacityIncrement
            如果 capacityIncrement 是0  则增长为  原来的2倍

ArrayList
     创建ArrayList对象的时候  底层是空的数组
     当第一次添加的时候 才会去开辟空间  默认的大小是 10
     是线程不安全的
     扩容到原来的1.5倍

共同点：
    都是采用Object[] 数组存储数据

 */
public class ListTest1 {
    @Test
    public void test01() {

        ArrayList<String> list = new ArrayList<>();
/*
  public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }
  public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[elementCount++] = e;
        return true;
    }

 */
        list.add("你好");

        Vector<String> vector = new Vector<>();

        vector.add("世界");


    }

    @Test
    public void test02() {
        int num = 6;// 1100
        //11
    /*
    右移一位  除以2

    左移一位  乘以2

     */

        System.out.println(6 >> 1);//3

        System.out.println(8 >> 1);//4

        System.out.println(6 << 1);//12

        System.out.println(8 << 1);//16

        System.out.println("-----------------------");
        System.out.println(10 + (10 >> 1));//10 15


    }

}
