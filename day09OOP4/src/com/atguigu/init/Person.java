package com.atguigu.init;

public class Person {
    String name   ;
    int age;

    {
        System.out.println("代码块三");
    }

    {
       name = "李白";
       age = 18;
        System.out.println("代码块一");
    }
    public Person(){
        System.out.println("person()");
    }
    {
        name = "李白";
        age = 18;
        System.out.println("代码块二");

    }


}
