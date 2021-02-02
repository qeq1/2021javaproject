package com.atguigu.lambda;

import org.junit.Test;

import java.util.Comparator;

/*
lambda是 jdk8的新特性

jdk5 枚举  泛型 包装类

jdk7 switch(表达式) byte short int String（1.7） char 枚举

     try(){}catch(Exception e){}


jdk8:lambda表达式
     重视结果,忽视过程




 */
public class Test1 {
   @Test
    public void test01(){


       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("线程开始启动了");
           }
       });
       thread.start();

   }
   @Test
    public void test02(){

       RabbitRunnable rabbitRunnable = new RabbitRunnable();
       Thread thread = new Thread(rabbitRunnable);
       thread.start();

   }

   @Test
    public void test03(){

       Comparator com;
       new Thread(()->System.out.println("哈哈")).start();
    }

}

class RabbitRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("兔子线程启动了");
    }
}
