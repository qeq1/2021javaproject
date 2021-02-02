package com.atguigu.map;

import org.junit.Test;

import java.util.HashMap;

/*
hash表：
   顺序表+链表
顺序表：
  顺序表每存储一个元素 就要开辟一个空间
      顺序表： 有长度限制 如果全部采用 顺序表存储 会造成空间的浪费
  链表：不限长度
        查找元素 比较慢  采用 顺序 表 + 链表 存储

hash表如何进行数据存储的；
   1.计算一个对象的hash码
   2.对hash码进行散列处理
     尽量避免hash冲突
   3. 会采用 处理后的hash码 & 顺序表长度-1  ;
       顺序表的 长度 永远是 2^n   16
       1 1 1 0 1 1
       &   1 1 1 1
       --------------------------
           1 0 1 1

 */
public class MapTest2 {


    @Test
    public void test01(){

        int a = 6;// 110

        int b = 5;// 101

        System.out.println(a & b);

    }

    @Test
    public void test02(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "世界");

    }



}
