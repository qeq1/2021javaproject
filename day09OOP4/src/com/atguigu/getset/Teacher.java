package com.atguigu.getset;

public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        //   this.age = age;
        setAge(age);
    }

    //给年龄进行赋值
    public void setAge(int age) {
        //age进行处理
        if (age > 1 && age <= 120) {
            //当年龄满足要求的时候 直接赋值
            this.age = age;
        } else {
            //当不满足要求时候 赋值为 18岁
            this.age = 18;
        }
    }

    public int getAge() {
        return age;
    }


    //给成员变量name赋值
    public void setName(String name) {
        this.name = name;
    }

    //获取成员变量的值
    public String getName() {
        return name;
    }


    public void info() {
        System.out.println("名字是：" + name + ",年龄是：" + age);
    }
}
