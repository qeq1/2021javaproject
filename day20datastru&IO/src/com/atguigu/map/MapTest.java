package com.atguigu.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
/*

Map

HashMap
   jdk1.2
   线程不安全
   key 和 value 都可以是null值
Hashtable
   jdk1.0
   线程安全的 synchronized
   key 和value 都不能是 null值

   共同点：
      都是存储键值对
      底层都是采用hash表






 */

public class MapTest {
    @Test
    public void test01(){

        // public V put(K key, V value) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "你好");
        map.put(null, null);
        map.put(null, "世界");

        System.out.println(map);
        Hashtable<Integer,String> map1 = new Hashtable<>();

         //public synchronized V put(K key, V value) {
        map1.put(1, "世界");

     //   map1.put(2, null);

        System.out.println(map1);



    }
}
