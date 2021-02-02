package com.atguigu.constru;

import java.util.Scanner;

/**
 * 创建三个学生对象
 */
public class TestStudent {
    public static void main(String[] args) {



        Student s1 = new Student();
        s1.height=1.78;
        s1.score=88;
        s1.age=18;
        s1.name="李白";
        s1.showInfo();
        Student s2 = new Student();
        s2.height=1.9;
        s2.name="邹忌";
        s2.age=19;
        s2.score=99;
        s2.showInfo();

        System.out.println("------------------------------------");

       Student s3 =  new Student("杜甫", 19, 100, 1.86);

        s3.showInfo();
        System.out.println("------------------------------------");

        Student s4 = new Student("王维", 20, 99, 1.58);
        s4.showInfo();

        System.out.println("------------------------------------");
        Student s5 = new Student("小明", 1.1);
        s5.showInfo();


    }
}
