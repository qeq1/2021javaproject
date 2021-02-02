package com.atguigu.method.methodtest1;

/*
1.如何定义方法/如何声明方法？

  public static void main(String[] args){ }

 [权限修饰符] [static] void 方法名(形参列表){}
2.方法如果只声明不调用是不会执行的
 */
public class TestMethod1 {


    public static void main(String[] args){

        System.out.println(args[0]);
        Student s1 = new Student();

        System.out.println(s1.age);

        Student.study();




    }
}
