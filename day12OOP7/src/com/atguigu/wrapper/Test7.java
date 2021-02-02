package com.atguigu.wrapper;
/*

不可变对象
包装类型
String
 */
public class Test7 {
    public static void main(String[] args) {


        Integer i1 = 20;
        System.out.println("changValue前:"+i1);
        changValue(i1);
        System.out.println("changValue后:"+i1);
    }

    private static void changValue(Integer i1) {
        i1 = 60;
        System.out.println("changValue中:"+i1);

    }
}
