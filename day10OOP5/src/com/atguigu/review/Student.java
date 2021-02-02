package com.atguigu.review;

public class Student {
    public String name ="3student";
    protected int age; //不同包下的子类可见
    double height;
    private String sex;

    public Student(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, int age, double height, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    public static void show(){

        System.out.println("this is show()");

    }


        public void info(){

        System.out.println(this.name);
    }

}
