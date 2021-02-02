package com.atguigu.argments;

/**
 * 可变形参： 参数的个数可以是任意个[0,n]
 * 如何声明可变形参： 方法的声明处 形参位置（数据类型...标识符）{
 * }
 * 三个点
 * public static void sum(int...a){}
 * <p>
 * 注意：
 * 1.可变形参采用数组存贮实参  [I@4554617c
 * 2.可变参数只能位于参数列表的最后
 * 一个方法可变参数只能有一个 且 必须位于参数列表的最后
 */
public class Test {

    public static void main(String[] args) {

        //  sum(10, 20, 30);
        //  sum(10, 20, 30, 40, 50, 60);
        //sum();
        sum(3.14, 10, 203, 40);

        int maxNum = getMaxNum(10, 20, 30, 66, 99);
        System.out.println("maxNum = " + maxNum);
    }

    private static int getMaxNum(int... arr) {


        System.out.println("====>"+arr.length);
        int maxNum = arr[0];

        for (int i : arr) {
            if (i > maxNum) {

                maxNum = i;
            }
        }
        return maxNum;
    }

   /* static void getSum(double... d1, int... arr) {


    }*/

    static void sum(double d1, int... a) {
        double sum = 0;
        //求 数组内的和
        for (int i : a) {
            sum += i;
        }
        //求数组内的和+double
        sum += d1;
        System.out.println(sum);
    }

    static void sum(int... a) {

      /* for(int i = 0;i<a.length;i++){
           System.out.println(a[i]);
       }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

      for(int ele:a){
          System.out.println(ele);
      }*/

        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("被调用了");


    }

  /*  private static void sum(int i, int i1, int i2, int i3, int i4, int i5) {

    }

    static void sum(int i, int i1, int i2) {
        System.out.println(i+i1+i2);
    }*/
}
