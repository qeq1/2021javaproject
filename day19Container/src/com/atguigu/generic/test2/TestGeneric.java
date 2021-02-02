package com.atguigu.generic.test2;

/*
给学生发布成绩

语文老师 出成绩 ： "特别棒"

数学老师 出成绩： 99.99

英语老师 出成绩 :  'A' 'B' 'C' 'D'




 */
public class TestGeneric {

    public static void main(String[] args) {
        Student<String> s1 = new Student<>("李白", "非常好");
        System.out.println(s1);
        Student<Double> s2 = new Student<>("华罗庚", 100.2);
        System.out.println(s2);
        // char --> Character
        Student<Character> s3 = new Student<>("李明", 'D');
        System.out.println(s3);
    }
}
class Student<T>{//类型化参数
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
