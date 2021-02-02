package com.atguigu.map;

import org.junit.Test;

import java.util.*;

/*
Map: 存储数据
     存储键值对
     K   V

   HashMap

   LinkedHashMap

   TreeMap

 */
public class TestMap1 {

    @Test
    public void test01() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        System.out.println(map);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 100);
        map1.put("B", 90);
    }

    @Test
    public void test02() {
/*

HashMap
   注意：1.key: 无序 唯一
        2.当key重复的时候 会替换掉原有的旧值
        3.value是可以重复的




 */
        Map<Integer, String> map = new HashMap<>();

        System.out.println("map.isEmpty() = " + map.isEmpty());

        map.put(1, "蔡旭坤");
        map.put(2, "蔡旭坤");
        map.put(1, "李白");
        map.put(3, "李白");

        System.out.println(map);//{1=李白, 2=蔡旭坤}
        //当前map集合内键值对的数量
        System.out.println("map.size() = " + map.size());
        System.out.println("map.isEmpty() = " + map.isEmpty());

        //替换指定的value
        map.replace(1, "李商隐");
        //删除指定key的键值对 返回对应的value
        String remove = map.remove(2);
        System.out.println(remove);


        System.out.println(map);


    }


    @Test
    public void test03() {

        Map<String, String> map = new HashMap<>();


        map.put("ch", "China");
        map.put("en", "English");
        map.put("jp", "Japan");


        String ch = map.get("ch");
        System.out.println("ch = " + ch);

        //获取所有的key
        Set<String> set = map.keySet();

        for (String s : set) {
            System.out.println(s + ":==>" + map.get(s));
        }
        System.out.println(map);

        System.out.println("------------------------------");
        //获取所有的value
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();

        while (iterator.hasNext()) {

            System.out.println("iterator.next() = " + iterator.next());
        }

        //判断 map.containsKey（） 指定的键在不在 map内
        System.out.println("map.containsKey(\"ch\") = " + map.containsKey("ch"));
        //判断 map.containsValue（） 指定的value在不在 map内
        System.out.println(map.containsValue("China"));
    }


    @Test
    public void test04() {

        Map<String, String> map = new HashMap<>();
        map.put("ch", "China");
        map.put("en", "English");
        map.put("jp", "Japan");

        /*
         map.entrySet() 获取的就是键值对

         此时 这个set内 包含当前Map所有的键值对
         */
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            //键值对
            Map.Entry<String, String> entry = iterator.next();
            //获取 key                                      获取value
            System.out.println(entry.getKey()+" ====> "+entry.getValue());
        }

        System.out.println("---------------------------------------------------");


        Set<String> set1 = map.keySet();

        for(String key:set1){
            System.out.println(key+" ---》 "+map.get(key));
        }
    }
}
