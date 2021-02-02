package com.atguigu.generic.test5;

import org.junit.Test;

/*
类型的通配符：
    E
    T
    K
    V

?: 带表任意类型
   有位置要求
    需要传入具体类型的位置 不能单独使用 ？
     声明 泛型类 泛型接口 泛型方法时 不能单独使用

？ extends T:  你传入的类型 可以是当前类型  以及当前类型的孩子

？ super T: 传入的类型 可以是当前类型 也可以是当前类型的父类

 */
public class Test1 {

    @Test
    public void test01() {

        Student<Integer> s1 = new Student<>("李白", 98);
        Student<Double> s3 = new Student<>("李白", 98.9);
        Student<Character> s2 = new Student<>("李白", 'A');

        Student<Object> s4 = new Student<>("李白", 'A');

        method(s4);

        method1(s1);

        method1(s2);
    }

    public void method1(Student<?> kk1) {


    }


    public void method(Student<Object> kk) {

    }

}

class Student<T> {

    String name;
    T score;


    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
