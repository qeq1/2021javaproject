package com.atuigu.api.math;

/*
数学类：

Math: 构造器私有
      方法都是静态方法



静态导入：导入某一个类中的静态资源
       import static 类路径;
         可以省略类名 直接调用
 */

import static java.lang.Math.*;

public class MathTest {
    public static void main(String[] args) {
        /*
        abs:求绝对值
        ceil:向上取整
        floor：向下取整
        random(): 随机数 [0,1) 左闭右开
        n:较大的数
        m:较小的数
        [m,n]
        (int)(Math.random()*（n-m+1）+m); *****
        pow(n,y)  ***
        pow(2,3)  2^3
        sqrt() 开平方 ***
        round() 四舍五入 ***
         */
        System.out.println("Math.abs(-10) = " + abs(-10));

        System.out.println("Math.abs(10) = " + Math.abs(10));

        System.out.println("Math.ceil(3.14) = " + Math.ceil(3.14));

        System.out.println("Math.ceil(9.01) = " + Math.ceil(9.01));

        System.out.println("Math.floor(9.8) = " + Math.floor(9.8));

        System.out.println("Math.floor(89.91) = " + floor(89.91));

        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.pow(2, 4) = " + Math.pow(2, 4));
        System.out.println("Math.sqrt(9) = " + Math.sqrt(9));


        System.out.println("Math.round(3.14) = " + Math.round(3.14));
        System.out.println("Math.round(3.14) = " + Math.round(3.5));
        System.out.println("Math.round(3.14) = " + Math.round(3.4));
        System.out.println("Math.PI = " + Math.PI);


    }
}
