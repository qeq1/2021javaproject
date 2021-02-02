package com.atguigu.wrapper;
/*

包装类型有一个缓存区：
Byte
Short
Integer
Long  [-128,127]
Character [0,127]
Boolean true false;

 */
public class Test6 {
    public static void main(String[] args) {


        Double.valueOf(3.14);

        Long.valueOf(20);
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        System.out.println("1===>"+(i1 == i2));//false true

        i1 = Integer.valueOf(400);
        i2 = Integer.valueOf(400);
        System.out.println("3===>"+(i1 ==i2));//false

        i1 = new Integer(100);
        i2 = new Integer(100);
        System.out.println("2===>"+(i1 == i2));//false



    }
}
