package com.atguigu.generic.test4;

import com.atguigu.generic.utils.MyArrays;
import org.junit.Test;

import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

    @Test
    public void test01() {


        Student s1 = new Student(10, "李白");
        Student s2 = new Student(8, "杜甫");
        Student s3 = new Student(20, "王安石");

        Student[] ss = {s1,s2,s3};

        MyArrays.sort(ss);

        System.out.println(Arrays.toString(ss));


      //  A[] as = {new A(),new A()};
    //    MyArrays.sort(as);


    }
}

class A{}

class Student implements Comparable<Student> {

    int age;

    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
