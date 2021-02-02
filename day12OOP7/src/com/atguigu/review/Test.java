package com.atguigu.review;

import java.time.Period;

public class Test {

    public static void main(String[] args) {
        Person person = new Person("李白", 18);
        //com.atguigu.review.Person@4554617c

        //getClass().getName() + "@" + Integer.toHexString(hashCode());
        String s = person.toString();
        System.out.println(person);
    }
}
class Person{
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}