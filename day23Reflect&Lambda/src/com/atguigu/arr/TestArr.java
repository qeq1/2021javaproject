package com.atguigu.arr;

import org.junit.Test;

import java.lang.reflect.Array;

public class TestArr {

    @Test
    public void test01(){
        //创建了一个数组 长度是5
        Object o = Array.newInstance(String.class, 5);
        //int [];
        System.out.println(o);

        Array.set(o, 0, "李白");
        Array.set(o, 1, "杜甫");


        Object o1 = Array.get(o, 1);

        System.out.println(o1);

        o1 = Array.get(o, 3);

        System.out.println(o1);
    }
}
