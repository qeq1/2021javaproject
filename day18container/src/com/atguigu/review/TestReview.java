package com.atguigu.review;

import org.junit.Test;

import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;

public class TestReview {

    @Test
    public void test01(){
// com.atguigu.review.Person cannot be cast to java.lang.Comparable
        Person p1 = new Person("zs", 12);
        Person p2 = new Person("zs", 9);
        Person p3 = new Person("zs", 78);

        Person[]ps = {p1,p2,p3};
    /*
        SortOfAge age = new SortOfAge();

        Arrays.sort(ps, age);*/

    Arrays.sort(ps, new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Person p1 = (Person)o1;
            Person p2 = (Person)o2;
            return p1.age-p2.age;
        }
    });



       // Arrays.sort(ps);

        String ss [] = {"a","v","Z"};


        Arrays.sort(ss);



    }
}

class Person implements Comparable{

    String name;

    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
