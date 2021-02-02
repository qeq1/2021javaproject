package com.atuigu.arr;


import org.junit.Test;

import java.util.Arrays;

public class ReverseTest {

    @Test
    public void test01() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("交换前：" + Arrays.toString(arr));

      /*  for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
*/
        //新建一个数组
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            //将倒叙后的元素存到数组内
            newArr[index++] = arr[i];
        }
        //再将新数组的地址赋给旧数组
        arr = newArr;
        System.out.println("交换后：" + Arrays.toString(arr));

    }


    @Test
    public void test02() {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("交换前：" + Arrays.toString(arr));
        /*
        只有一半数据进行首位【交换】
         */
        for(int i = 0;i<arr.length/2;i++){
            int temp  =arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        System.out.println("交换后：" + Arrays.toString(arr));
    }
}
