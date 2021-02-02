package com.atguigu.map;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*

LinkedHashMap
   key:有序  添加顺序
   value:满足泛型即可 可以重复
 */
public class LinkedHashMapTest1 {

    @Test
    public void test1(){
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("ch", "China");
        map.put("en", "English");
        map.put("en", "英国");
        map.put("jp", "Japan");
        map.put("jp", "日本");
        System.out.println(map);
    }

    @Test
    public void test02(){
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("ch", "China");
        map.put("en", "English");
        map.put("en", "英国");
        map.put("jp", "Japan");
        map.put("jp", "日本");

        //此set内存储了map内所有的键值对
        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
