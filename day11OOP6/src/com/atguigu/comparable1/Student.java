package com.atguigu.comparable1;

public class Student implements Comparable{

    String name;
    int age;
    double score;

    @Override
    public int compareTo(Object o) {//写比较规则
        // Object o  = s2;
        Student s = (Student)o;
        return this.age - s.age;
    }

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


}
