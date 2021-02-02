package com.atguigu.stream;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/*
创建流
 */
public class CreateStream {

    @Test
    public void test01() {
        //******
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Stream<Integer> stream = list.stream();
        //获取并行流
        //  Stream<Integer> stream = list.parallelStream();

        stream.forEach((t) -> {
            System.out.println(Thread.currentThread().getName() + " ===> " + t);

        });
    }

    @Test
    public void test02() {
        //******
        int[] arr = {20, 30, 43, 23, 12};
        Arrays.stream(arr).forEach(System.out::println);
    }
    @Test
    public void test03() {
        //******
        Stream.of(10, 20, 30, 56).forEach(System.out::println);

    }


    @Test
    public void test04() {


     /*   Stream.iterate(1, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return 10;
            }
        }).forEach(System.out::println);*/

      //  Stream.iterate(1, (t) -> t += 1).forEach(System.out::println);

        Stream.generate(Math::random).forEach(System.out::println);


    }
}
