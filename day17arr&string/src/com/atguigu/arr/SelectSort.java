package com.atguigu.arr;

import java.util.Arrays;
/*
直接选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = { 70, 60, 50, 40, 30, 20,10};
        System.out.println("排序前："+ Arrays.toString(arr));
        for (int i = 0; i < arr.length-1 ; i++) {
            //假设此位置就是最小值
            int minIndex = i;
            //i+1 假设之后的值 与假设的值进行比价
            for (int j = i + 1; j < arr.length; j++) {
                //进行比较 找真正的最下值的下标
                 // 如果一个数 比最小值还小 则说明此数是最小数
                if(arr[j]<arr[minIndex]){
                    //切换最小值的下标
                    minIndex = j;
                }
            }



            //当循环结束后
            //如果假设的最小值的下标 发生了改变 则进行交换俩数的位置

            if(i!=minIndex){

                int temp = arr[i];

                arr[i] = arr[minIndex];

                arr[minIndex] = temp;

            }

            System.out.println("排序中："+Arrays.toString(arr));



        }

        System.out.println("排序后："+ Arrays.toString(arr));


    }


}
