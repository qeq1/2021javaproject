package com.atguigu.thistest;

public class Person {
    private String name;
    private int age;
    private double salary;
    private double height;


    public Person() {
       // this("李白",18,888.77);
    }


    public Person(String name, int age, double salary, double height) {
        this(name, age, salary);
      /*  this.age = age;
        this.salary = salary;
        this.name = name;*/
        this.height = height;
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
       getInfo();
    }


    public void getInfo(){

        System.out.println("名字是："+name+"年龄是："+age+"薪水是："+salary+",身高是："+height);
    }

}
