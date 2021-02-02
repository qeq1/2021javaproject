package com.atguigu.statictest;
// 静态导入 导入一个类中所有的静态资源
import static java.lang.Math.*;
public class Test {

    public static void main(String[] args) {
        String s = "111";
        System.out.println(Math.PI);
        System.out.println(Math.pow(2, 3));
        System.out.println(PI);

        System.out.println(pow(3, 3));

    }
}
