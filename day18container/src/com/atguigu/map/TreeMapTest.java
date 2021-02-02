package com.atguigu.map;

import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
/*
TreeMap:
    key 有序：自然顺序
    value:可以重复
 */
    @Test
    public void test01() {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "蔡旭坤");
        map.put(9, "陈坤");
        map.put(-1, "谢广坤");
        map.put(20, "杨坤");
        map.put(-1, "杨坤坤");

        System.out.println(map);

    }


    @Test
    public void test02(){
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "蔡旭坤");
        map.put(9, "陈坤");
        map.put(-1, "谢广坤");
        map.put(20, "杨坤");
        map.put(-1, "杨坤坤");

        Set<Integer> set = map.keySet();

        for (Integer key : set) {

            System.out.println(key+"--->"+map.get(key));
        }


    }
}
