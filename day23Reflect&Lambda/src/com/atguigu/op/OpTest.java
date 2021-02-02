package com.atguigu.op;

import org.junit.Test;

import java.util.Optional;

public class OpTest {

    @Test
    public void test01(){
        //String s = null;
        String s = "你好";
        Optional<String> s1 = Optional.ofNullable(s);
        System.out.println(s1.orElse("世界"));
    }


    @Test
    public void test02(){

        Student s1 = new Student();

        Optional<String> name = getName(s1);

        System.out.println(name.orElse("张三"));

    }

    public static Optional<String> getName(Student s){


        return Optional.ofNullable(s.name);
    }


}

class Student{

    public Student() {
    }

    String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
