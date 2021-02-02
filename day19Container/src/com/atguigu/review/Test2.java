package com.atguigu.review;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {

    Map<Integer,String> map = new HashMap<>();

    @Before
    public void testBefor(){
        map.put(1, "李白");
        map.put(2, "杜甫");
        map.put(3, "王安石");
        map.put(4, "李商隐");

    }
    @Test
    public void test02(){
        // 将 map内 所有的键值对 添加到 set 集合内
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        // entry : 代表键值对
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
    }

    @Test
    public void test01(){
        Set<Integer> keySets = map.keySet();
        Iterator<Integer> iterator = keySets.iterator();
        while (iterator.hasNext()){

            Integer ele = iterator.next();
            System.out.println(ele+"--->"+map.get(ele));
        }


    }


}
