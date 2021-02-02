package com.atguigu.comparable1;

/*
使用 comparable 接口完成引用数据类型的比较


 */
public class Test {

    public static void main(String[] args) {


        Student s1 = new Student("张三", 29, 88.9);
        Student s2 = new Student("李四", 19, 88.9);

        //按照年龄比较
        /*
        0 : 俩数相等

        正数:第一个数大于第二个数

        负数：第一个数小于第二个数
         */
        int i = s1.compareTo(s2);

        System.out.println(i);


    }
}
