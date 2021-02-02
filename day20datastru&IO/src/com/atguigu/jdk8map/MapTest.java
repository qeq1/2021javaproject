package com.atguigu.jdk8map;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
认识成员变量：
默认的底层数组的长度
 static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
 底层数组的最大长度
     static final int MAXIMUM_CAPACITY = 1 << 30;
     //默认的加载因子
     static final float DEFAULT_LOAD_FACTOR = 0.75f;
   //树化的阈值
       static final int TREEIFY_THRESHOLD = 8;
       非树化的阈值
       static final int UNTREEIFY_THRESHOLD = 6;
       //最小的树化的容量
      static final int MIN_TREEIFY_CAPACITY = 64;

       size:当前集合内元素的数量

       //底层顺序表的数据类型
      transient Node<K,V>[] table;

      static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;
        }
jdk1.7 是采用顺序表 + 链表
jdk1.8 是采用 顺序表 + 链表 + 红黑树（二叉树）
                当链表的数量>8 的时候

                会转为红黑树进行存储

//创建完对象之后
   将加载因子 给成员变量赋值了 没有给底层数组进行开辟空间

开始调用put()
  1.第一步对key进行hash运输
   注意：
      如果key==null h: 0
      如果key!=null 进行位运算
     为了减少hash冲突
  2. 当第一次调用 put()
      完成了对底层数组的创建 Node[] 长度是 16
       阈值变为 12
  3.1 当第一次向指定位置添加数据的时候 此位置没有数据 直接新增


  3.2当第二次添加 存储的位置是有值的

      key 不重复  直接下原有数据的末尾进行元素的追加  八下

      kye 不重复  链表的数量 已经达到8  并且底层数组的长度 已经大于 64 才会进行树化操作
       将数据转为红黑树进行存储

  3.3当第三次添加
      key重复
      新数据 会替换掉旧数据
      并将旧数据返回
 */
public class MapTest {

    @Test
    public void test05(){
        /*
        LinkedHashSet: 底层采用的是 HashMap
        private static final Object PRESENT = new Object();
         */
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(20);


    }


    @Test
    public void test04(){
        /*
        TreeSet 底层采用的是 TreeMap 存储数据
         */
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);

    }

    @Test
    public void test03(){


        HashSet<String> hashSet = new HashSet();

        hashSet.add("李白");
        hashSet.add("杜甫");

        hashSet.size();

        /*
          hashSet底层采用的是HashMap存储数据  数据放到了key的位置
         private static final Object PRESENT = new Object();
         所有的value 都共用 这一个对象 PRESENT

         */


    }


    @Test
    public void test01() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "你好");
        map.put(20, "世界");

        String ss = map.put(20, "是你的");
        System.out.println(ss);
        System.out.println(map);
    }

    @Test
    public void test02() {

        HashMap<MyData, String> my = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            my.put(new MyData(i), "同九年，汝何秀" + i);
        }
    }

}

class MyData {
    int num;

    public MyData(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyData)) return false;

        MyData myData = (MyData) o;

        return num == myData.num;
    }

    @Override
    public int hashCode() {

        if (num % 2 == 0) {
            return 1;
        }
        return num;
    }
}