package com.atguigu.lambda.consumer;

import org.junit.Test;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
消费型接口

貔貅： 只进不出
 */
public class Test2 {

    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();

        list.add("李白");
        list.add("杜甫");
        list.add("白居易");
        list.add("李商隐");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

        for (String s : list) {

            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){

            System.out.println(listIterator.next());
        }


    }

    @Test
    public void test03(){

        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("白居易");
        list.add("李商隐");
      /*  list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

     // list.forEach((l)->{System.out.println(l);});

        //当只有一个参数的时候 可以省略 （）
        list.forEach(l->System.out.println(l));
    }

    @Test
    public void test02(){

        Map<Integer,String> map = new HashMap<>();

        map.put(10, "李白");
        map.put(11, "杜甫");
        map.put(12, "王安石");
        map.put(13, "李商隐");


  /*      map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String v) {
                System.out.println(key+"--->"+v);
            }
        });*/

        map.forEach((k,v)->{
            System.out.println(k+ " : "+v);
        });


    }

}



