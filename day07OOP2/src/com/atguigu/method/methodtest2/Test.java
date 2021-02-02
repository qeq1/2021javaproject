package com.atguigu.method.methodtest2;

import java.security.PublicKey;

/*
1.方法只声明不调用 是不会执行的

2.静态方法 使用类名.方法名进行调用
  如果在本类中 可以省略类名

3.如何定义方法/如何声明方法？
  public static void main(String[] args){ }

 [权限修饰符] [static] void 方法名(形参列表){}
 void: 没有返回值的意思
 4.方法的执行顺序 与声明顺序无关 ，只与调用顺序有关  谁先调用 谁先执行


 5.方法与方法是兄弟关系 方法与方法的地位是平等的。

 6.方法可以在任何方法中被调用

 7.方法执行完毕之后 会回到方法的调用处


 */
public class Test {

    static void printHello(){

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World() "+(i+1));
        }
        showMessage();

        System.out.println("printHello  Over!!!");
    }

    //JVM
    public static void main(String[] args) {
        System.out.println("this is main()");

      //  Test.showMessage();

         printHello();

        System.out.println("main Over!!!");


    }
       static void showMessage(){

        System.out.println("this is showMessage()");


    }



}
