package com.atguigu.jdk7map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
/*
1.7jdk map
  认识成员变量：
  DEFAULT_INITIAL_CAPACITY= 16; 默认的顺序表的长度
  static final int MAXIMUM_CAPACITY = 1 << 30;//顺序表的额最大长度
   static final float DEFAULT_LOAD_FACTOR = 0.75f;//默认的加载因子
   Entry<K,V>[] table; //顺序表的 数据类型
     class Entry<K,V> implements Map.Entry<K,V> {
        final K key;
        V value;
        Entry<K,V> next;
        int hash;
        }
transient int size;//集合中元素的数量
//The next size value at which to resize (capacity * load factor).
 int threshold;//阈（开关/阀门）值  12
 顺序表什么时候扩容：
     1.当size >=阈值 初始化长度 * 加载因子
     2.要存入的位置 有数据
      进行扩容  扩容的规则  2 * table.length
      加载因子 如果太小 会造成 顺序表太长 空间浪费
      加载因子太大 链表太长  影响 查找元素的效率


 一.当创建完对象后
    底层Entry类型的数组 已经完成初始化 长度为16
    阈值的值 是12
    加载因子 0.75f
二.调用put()方法

   2.1如果key为null
       当key为null 会将数据存储到 顺序表中下标为0的位置
       如果 已经存在 key 为null的数据  则 直接将 新数据 替换掉原来的旧数据 并将 旧的value进行返回


   2.2 key不为null
      调用hash方法对 key 进行散列算法 拿到 hash值
      indexFor(hash,数组的长度); 计算在hash表内顺序表的位置

  2.2.1 当指定位置有数据时
       有key重复数据
           如果key重复了 则 将 新的value替换掉 旧的value 并将旧的value进行返回

       没有重复数据
        新增一个节点  并将此节点 放到顺序表中的第一个位置 之前的旧数据 会 在新数据的后面进行追加
        七上
  2.2.2当指定位置没有数据时
       新增一个entry节点

 */

public class Map7 {


    @Test
    public void test01(){

        HashMap<MyData,String> map = new HashMap<>();

        for (int i = 0;i<40;i++){
            map.put(new MyData(i+1),"世界"+i);
        }
    }

    @Test
    public void test02 (){

        HashMap<Integer, String> map = new HashMap<>();
       /* map.put(null,"你好");
        String key = map.put(null, "世界");
        System.out.println(key);
        System.out.println(map);*/

        map.put(1, "世界");

        map.put(16, "李白");

        String oldValue = map.put(16, "王安石");
        System.out.println(oldValue);
        System.out.println(map);
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


