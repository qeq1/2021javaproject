package com.atguigu.arr;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest {
    /*
    toString()
    sort();
    copyOf();
    binarySearch();



     */
    @Test
    public void test06() {

        int[] arr = {7, 6, 5, 4, 3, 2, 10};

        Arrays.sort(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        /*
        使用二分查找 数组必须有序
        当返回小于0的数 则说明 数组内 不含有此元素
         */

        int i = Arrays.binarySearch(arr, 3);

        System.out.println("i = " + i);


    }


    @Test
    public void test05() {
        int[][] arr = {{1, 2}, {10, 20}, {66, 88}};
        //System.out.println(Arrays.toString(arr));
        //遍历二维数组
        System.out.println(Arrays.deepToString(arr));

        int[] a1 = {1, 2};
        int[] a2 = {2, 1};

        System.out.println(a1 == a2);//false

        /*
         Arrays.equals(a1, a2);
         比较的是内容 以及下标 是否完全一致
         完全一致 true
          否则：   false
         */
        boolean flag = Arrays.equals(a1, a2);

        System.out.println("flag = " + flag);


    }

    @Test
    public void test04() {

        int[] arr = new int[5];

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        //填充数组
        //Arrays.fill(arr, 10);
/*
安装指定的范围添加元素
 Arrays.fill(arr, 开始下标, 结束下标, 填充的元素);
 [开始下标,结束下标);
 */
        Arrays.fill(arr, 0, 3, 66);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


        String s[] = {"张三", "李四", "王五"};
        // 复制旧数组 创建一个新的数组
        // String[] s2 = Arrays.copyOf(s, 2);

        /*
          Arrays.copyOfRange(数组名，开始下标,结束下标);
          [开始下标,结束下标)
         */
        String[] s2 = Arrays.copyOfRange(s, 0, 1);
        //  s2[0] = "你好";
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s2));

    }


    @Test
    public void test01() {

        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(arr);//[I@5d6f64b1
        String s = Arrays.toString(arr);
        System.out.println(s);
        /*
          Arrays.sort(排序的数组, 开始的下标, 结束的下标);
          [开始下标,结束下标)
         */
        Arrays.sort(arr, 0, 4);


        System.out.println("===>" + Arrays.toString(arr));

        //对数组元素进行排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    @Test
    public void test02() {

        Person p1 = new Person("李白", 18);
        Person p2 = new Person("杜甫", 19);
        Person p3 = new Person("王安石", 8);

        Person[] ps = {p1, p2, p3};

        System.out.println("排序前：" + Arrays.toString(ps));
        Arrays.sort(ps);
        System.out.println("排序后：" + Arrays.toString(ps));


    }

    @Test
    public void test03() {
        /*
        如果比较的是 系统类型
        Integer Byte  基本数据类型
        String


        如果是自定义类型
         Student[] ss = {p1, p2, p3};

         自定义类 实现了 Comparable 接口
         Arrays.sort(ss);

         自定义类 没有实现Comparable 接口

         Arrays.sort(ss,比较规则);

         */
        Student p1 = new Student("李白", 18);
        Student p2 = new Student("杜甫", 19);
        Student p3 = new Student("王安石", 8);
        Student[] ss = {p1, p2, p3};
        System.out.println("排序前：" + Arrays.toString(ss));
//java.lang.ClassCastException
        Arrays.sort(ss, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return s1.age - s2.age;
            }
        });


        System.out.println("排序后：" + Arrays.toString(ss));


        System.out.println("new Person() = " + new Person());

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

class Person implements Comparable {

    Student s = null;//null

    @Override
    public String toString() {
        return "Person{" +
                "s=" + s +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    public int compareTo(Object o) {

        Person p = (Person) o;

        return this.age - p.age;
    }
}