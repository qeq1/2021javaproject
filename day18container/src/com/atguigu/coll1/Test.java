package com.atguigu.coll1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

声明学员类型Student，包含属性：姓名，成绩
添加本组学员Student对象到Collection的某个集合中

* 使用foreach遍历
* 使用Iterator遍历，并删除成绩低于60分的
 */
public class Test {

    public static void main(String[] args) {
        Collection<Student> c1 = new ArrayList<>();//多态

        Student s1 = new Student("李白", 13);
        Student s2 = new Student("杜甫", 15);
        Student s3 = new Student("王安石", 83);

        c1.add(s1);
        c1.add(s2);
        c1.add(s3);

        for (Student student : c1) {
            System.out.println(student);
        }


        System.out.println("-------------------------------------------------");

        Iterator<Student> iterator = c1.iterator();


        while (iterator.hasNext()){

            Student eleStu = iterator.next();


            if(eleStu.score<60){
                iterator.remove();
            }
        }
        System.out.println(c1);

    }
}
class Student{
    String name;
    int score;
    public Student() {
    }
    public Student(String name, int score) {
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