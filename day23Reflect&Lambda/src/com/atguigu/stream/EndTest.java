package com.atguigu.stream;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
中间操作可以有多个
终结操作只能有一个
 */
public class EndTest {

    @Test
    public void test01() {

        long count = Stream.of(10, 20, 30, 1, 1, 2, 3, 4, 5, 7).filter((s) -> s % 2 != 0).peek(System.out::println).count();
        System.out.println("--->" + count);


    }

    @Test
    public void test02() {
        //allMatch 所有的元素 是不是都是10
        //anyMathch
        //noneMath
        boolean b = Stream.of(10, 20, 30, 1, 1, 2, 3, 4, 5, 7).anyMatch((s) -> s == 10);

        System.out.println(b);


    }

    @Test
    public void test03() {


        Optional<Integer> first = Stream.of(10, 20, 30, 1, 1, 2, 3, 4, 5, 7).findFirst();

        System.out.println(first.get());


    }

    @Test
    public void test04() {
        /*
        collect: 将满足要求的数据 进行 收集
         */
        List<Integer> collect = Stream.of(10, 20, 30, 1, 1, 2, 3, 4, 5, 7).filter((s) -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test05() {

        //将值进行反复结合 最终变为一个值
       /* Optional<Integer> reduce = Stream.of(10, 20, 30).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });*/
        Optional<Integer> reduce = Stream.of(10, 20, 30).reduce((s, s1) -> s + s1);
        System.out.println(reduce.get());
    }
}
