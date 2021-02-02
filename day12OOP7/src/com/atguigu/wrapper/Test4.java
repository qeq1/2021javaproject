package com.atguigu.wrapper;

import java.util.Scanner;

/*

字符串与基本类型数据/包装类型的转换:


1. 字符串--->基本数据类型/包装类型
   方法一：
       Integer.parseInt("字符串纯数字");
       如果不是纯数字 会 报异常 NumberFormatException

   方法二：
       Integer in = new Integer("字符串纯数字");
       如果不是纯数字 会 报异常 NumberFormatException


    其他包装类型 以此类推：
    Double.parseDouble("字符串小数");
    Boolean.parseBoolean()
    Long.parseLong("")

    注意： char中没有此方法
      "AB".charAt(1)：  0代表第一个字符
                        1 代表第二个字符


2.基本类型数组转为字符串

   1.""+基本类型的数值

   2.String.valueOf();



 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请您输入一个数字");
        String age = in.next();//18 19 20

        //   int i = Integer.parseInt(age);

     /*

        int i = new Integer(age);

        System.out.println(i);

*/
        double v = Double.parseDouble(age);


        System.out.println("v = " + v);


        int a = 10;

        System.out.println(a + 10);

        String ss = "" + a;

        String s = String.valueOf(20);
        System.out.println(s + 10);


    }
}
