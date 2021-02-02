package com.atguigu.javadoc;

public class Person {
    String name;
    int age;

    /**
     * 两个参数的构造器
     * @param name 姓名
     * @param age 年龄
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    /**
     * 求俩数的和
     * @param i 第一个参数
     * @param j 第二个参数
     * @return 和
     */
    public int getSum(int i,int j){
        return 90;
    }
}
