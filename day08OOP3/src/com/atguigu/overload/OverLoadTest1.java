package com.atguigu.overload;

/*
测试不同数据的数值是否相等



 */
public class OverLoadTest1 {
    public static void main(String[] args) {

        byte b = 10;
        byte b1 = 120;

        boolean compare = compare(b, b1);
        System.out.println("compare = " + compare);

        short s = 10;
        short s1 = 20;

        boolean compare1 = compare(s, s1);
        System.out.println("compare1 = " + compare1);

    }


    public static boolean compare(short s1,short s2){
        return s1==s2;
    }

    public static boolean compare(byte b1, byte b2) {
       /* if(b1==b2){
            return true;
        }
        return false;*/
        return b1 == b2;
    }

}
