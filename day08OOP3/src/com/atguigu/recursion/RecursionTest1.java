package com.atguigu.recursion;

/*
递归：方法自己调用自己

递归有两个条件：
 1.有出口
 2.不断的向出口靠近

需求： 1~100的和
100 + 99 +98 +97 +96 ... 1
  java.lang.StackOverflowError 栈溢出异常
 */
public class RecursionTest1 {

    public static void main(String[] args) {
        int sum = getSum(50000);
        System.out.println("sum = " + sum);
    }

    public static int getSum(int num) {
        //出口
        if (num == 1) {
            return 1;
        }
        //不断的向出口靠近
        return num + getSum(num - 1);
    }
}
