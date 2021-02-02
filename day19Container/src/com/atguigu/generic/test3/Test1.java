package com.atguigu.generic.test3;

import java.util.ArrayList;
/*
泛型擦除
  1. 当一个泛型类 或者 泛型接口 没有指定 类型 则 使用 提升为Object 类型进行处理


  2.局部变量的泛型 在编译后会消失

    方法形参 成员变量 泛型 不会消除

 */
public class Test1 {
    ArrayList<Integer> list2 = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
    public static void show(ArrayList<Integer> arr){



    }


}


class Student implements Comparable{


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}