package com.atguigu.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*

1.不会对原有数据造成影响

2.中间操作的流和  终结操作的流 必须是同一个流
  流水线 操作工


 */
public class MiddleTest {
    ArrayList<Integer> list = new ArrayList<>();

    @Test
    public void test01() {
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3);
        list.add(5);
        //1.创建流
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = stream.filter((s) -> s % 2 == 0);
        stream1.forEach(System.out::println);
        System.out.println(list);
    }

    @Test
    public void test02() {


        list.add(10);
        list.add(9);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3);
        list.stream().filter((s) -> s % 2 != 0).forEach(System.out::println);
    }


    @Test
    public void test03() {

        list.add(10);
        list.add(9);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3);

        //  list.stream().sorted().forEach(System.out::println);

       /* list.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        }).forEach(System.out::println);*/
        list.stream().sorted((s, s1) -> {
            return s1.compareTo(s);
        }).forEach(System.out::println);
    }

    @Test
    public void test04() {
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3);
        //limit(2)取前两个
        //skip(1) 跳过一个
        list.stream().sorted((s, s1) -> {
            return s1.compareTo(s);
        }).limit(2).skip(1).forEach(System.out::println);
    }


    @Test
    public void test05() {
        String[] arr = {"hello", "world", "hero"};
        //映射关系
        Arrays.stream(arr).map((s) -> s.toUpperCase()).forEach(System.out::println);
    }

    @Test
    public void test06(){
        //distinct() 去除重复的元素
        Stream.of(1,2,3,3,2,1,10,20).distinct().forEach(System.out::println);


    }
}
