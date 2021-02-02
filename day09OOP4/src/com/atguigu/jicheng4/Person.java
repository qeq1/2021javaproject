package com.atguigu.jicheng4;

/*
1、声明父类：Person类
包含属性：姓名，年龄，性别
属性私有化，get/set
包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男
 */
public class Person {

    private String name;
    private int age;
    private char sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void getInfo() {
        System.out.println("姓名：" + name + "年龄：" + age + "性别：" + sex);
    }

}
