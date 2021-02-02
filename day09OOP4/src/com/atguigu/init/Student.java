package com.atguigu.init;

public class Student {
    static int age;

  /*  public Student(int age){
        this.age = age;
    }*/


    static {
        System.out.println("静态代码块三");
    }
    int c;
    static {
        age = 20;
        System.out.println("静态代码块一");
    }
    public Student() {
        System.out.println("Student()");
    }

    static {
        System.out.println("静态代码块二");
    }

}
