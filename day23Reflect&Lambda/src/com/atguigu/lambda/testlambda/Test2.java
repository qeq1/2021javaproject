package com.atguigu.lambda.testlambda;

import org.junit.Test;

public class Test2 {

    @Test
    public void test01() {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("哈哈哈");
            }
        };
        new Thread(runnable).start();
        /*
        接口内的方法没有任何参数

        (): 看一下要重写的方法 有没有参数
        ->: lambda的一个标识
        {}：代表了当前 方法体  重写方法要做的内容

        ()->{ System.out.println("哈哈哈");}

         */
        new Thread(() -> {
            System.out.println("哈哈哈");
        }).start();

    }

    @Test
    public void test02() {

        int a = 10;
        int b = 20;

    /*    show(a, b, new Calc() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        });*/

       /* show(a, b, (int c1, int d1) -> {
            return c1 + d1;
        });*/
       //可以省略形参的类型  接口中已经定义了方法的形参
        /*show(66, 88, (c1, d1) -> {
            return c1 + d1;
        });*/
        //当 方法体只有一局代码的时候 则 可以省略return
        show(60, 80, (c1, d1) -> c1 + d1);
    }

    static void show(int a, int b, Calc c) {
        int add = c.add(a, b);
        System.out.println(add);
    }
}

interface Calc {
    int add(int a, int b);
}