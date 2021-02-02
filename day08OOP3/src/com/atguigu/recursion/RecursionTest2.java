package com.atguigu.recursion;

/*
菲波那切数列
递归有两个条件：
     1.有出口
     2.不断的向出口靠近


 1 1 2 3 5 8 13 21 34

 求第n个数是几
 从第三个数开始
  n = (n-1)+(n-2);


 */
public class RecursionTest2 {

    public static void main(String[] args) {

        int feibo = feibo(6);
        System.out.println("feibo = " + feibo);
    }
    /**
     * @param n 第几个位置
     * @return 第几个位置的数
     */
    public static int feibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return feibo(n - 1) + feibo(n - 2);

    }
}
