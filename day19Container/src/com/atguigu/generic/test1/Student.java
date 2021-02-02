package com.atguigu.generic.test1;

public class Student implements Comparable<Student>{

    String name;

    int age;


  /*  @Override
    public int compareTo(Object o) {
        Student s1 = (Student)o;
        return this.age - s1.age;
    }*/

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
