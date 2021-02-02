package com.atguigu.collections;

import org.junit.Test;
import sun.plugin2.message.GetAppletMessage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
/*

sort

binarySearch()

addAll();
 */



    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
       /* list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);*/
        Collections.addAll(list, 10, 20, 30, 40, 50, 60, 1, 2);
        System.out.println(list);
        //倒叙 不是进行排序
        Collections.reverse(list);
        System.out.println("reverse:" + list);
        //排序 从小到大
        Collections.sort(list);
        System.out.println(list);

        //获取指定元素对应的下标
        int index = Collections.binarySearch(list, 20);
        System.out.println(index);

        Collections.reverse(list);

        System.out.println("reverse：" + list);
        //洗牌 打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
    }


    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "李白", "杜甫", "王安石", "李白");
        System.out.println(list);
        // 统计 指定元素 在集合内出现的次数
        int count = Collections.frequency(list, "李白");
        System.out.println("count = " + count);


        List<String> destList = new ArrayList<>();

        Collections.addAll(destList, "蔡旭坤", "亚索", "盖伦", "大龙");
        /*
        集合的复制
          Collections.copy(目标集合,数据源集合);
          使用时 注意 目标集合的长度 >= 数据源集合长度 否则报错
         */
        // Collections.copy(destList,list);
        System.out.println(destList);
        //将指定的元素 按照 下标 进行交换
        Collections.swap(destList, 0, 2);
        System.out.println(destList);
        // 返回的集合不能修改
        List<String> strings = Collections.unmodifiableList(list);
        strings.add("李商隐");
        System.out.println(strings);
    }


    @Test
    public void test03() {

        List<Person> list = new ArrayList<>();

        list.add(new Person("李白", 19));
        list.add(new Person("杜甫", 2));
        list.add(new Person("王安石", 22));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

    @Test
    public void test04() {

        List<Student> ls = new ArrayList<>();

        ls.add(new Student("李白", 19));
        ls.add(new Student("杜甫", 2));
        ls.add(new Student("王安石", 22));
        System.out.println(ls);

        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               // return o2.age-o1.age;
                return -(o1.age-o2.age);
            }
        });

        System.out.println(ls);
    }
}


class Student {

    String name;

    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
public interface Comparable<T> {}
 */

class Person implements Comparable<Person> {
    public static void main(String[] args) {

        getSum(10,20);
    }

    public static void getSum(int a ,int b){




    }

    String name;

    int age;

    public Person() {
    }

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
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}