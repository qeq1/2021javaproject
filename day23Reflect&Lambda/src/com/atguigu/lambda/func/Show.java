package com.atguigu.lambda.func;
/*

@FunctionalInterface
检验当前的接口是不是函数式接口
只能有一个抽象方法

知道的函数式接口：
    Runnable
    Comparator
 */
@FunctionalInterface
public interface Show {
    int NUM  =20;
    public void show();
    public static void showMessage(){
        System.out.println("this is showMessage()");
    }

    public default void cc(){

        System.out.println("this is cc()");
    }
}
