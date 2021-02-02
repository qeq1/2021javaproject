package com.atguigu.test;

import com.atguigu.view.CustomerView;
import org.junit.Test;

import java.util.Arrays;

public class TestCustomer {

    public static void main(String[] args) {
         CustomerView.show();
    }
    @Test
    public void test01(){
         /*
        int [] arr  ={20,30,40,50};
                      20 40 50 0

         */

        int[] arr = {20, 30, 40, 50};





        System.out.println("arr ：" + Arrays.toString(arr));
        /**
         * src      the source array.  数据源  要复制的数组
         * srcPos   开始的下标
         * dest     目标数组
         * destPos   目标数组开始的下标
         * length   操作的数量
         */
        //進行數組"复制"使用
        int[] a = new int[4];

        System.arraycopy(arr,1,a,2, 2);

        System.out.println("a: " + Arrays.toString(a));
    }

    @Test
    public void test02(){
        /*
          int[] arr = {20, 30, 40, 50};
            1   2   3  4
           20, 30, 40, 50
           要删除 30

           System.arraycopy(arr,3,arr,3-1,2);
           //将最后一个元素变为默认值





         */
        int[] arr = {20, 30, 40, 50};


        System.arraycopy(arr, 2, arr, 1, 2);


        arr[arr.length-1] = 0;

        System.out.println(Arrays.toString(arr));






    }

    @Test
    public void test03(){

        /*
        元素的数量 count： 4
        编号  1  2  3   4
         */
        //            1   2  3  4
        int [] arr = {66,88,99,100,0};
        /*
        删除  88
         */
        //从 编号 开始   替换时 从 编号-1开始   移动的数量 = count - 2;
        System.arraycopy(arr, 3, arr, 2, 1);
        //最后一个元素 是 count-1;
        arr[3] = 0;

        System.out.println(Arrays.toString(arr));








    }


}
