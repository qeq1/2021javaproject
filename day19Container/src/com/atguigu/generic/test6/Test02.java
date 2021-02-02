package com.atguigu.generic.test6;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

public class Test02 {
    @Test
    public void test01(){


        MyList<String> myList = new MyList<>();

        myList.add("你好");
        myList.add("世界");

    }
    @Test
    public void test02(){

        MyList<Number> m1 = new MyList<>();

        m1.add(10);
        m1.add(new BigDecimal(20));

        MyList<Object> m2 = new MyList<>();
        m2.add(90);
        m2.add(new Date());
        copy(m1, m2);
    }


    /**
     * @param src ? 可能是T 也可能是 T的孩子 MyList<? extends T> src
     * @param dest MyList<? super T> dest  ? 可以是T 也可以是T的父亲
     * @param <T>
     */
    public static <T>void copy(MyList<? extends T> src,MyList<? super T> dest){



    }



}
