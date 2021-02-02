package com.atuigu.arr;

/*

二分查找：
   前提： 数据必须有序
         从小到大的顺序

    10000
       7500

       从中间分为两部分

      < 5000<

      7500
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 88, 90, 100};

        int index = binarySearch1(arr, 88);

        if(index!=-1){
            System.out.println("指定元素对应的下标是："+index);
        }else{
            System.out.println("没有此元素");
        }
    }

    /**
     * @param arr 要查找的数组
     * @param ele 要查找的元素
     */
    private static int binarySearch1(int[] arr, int ele) {
        //1.获取开始下标 结束下标
        int startIndex = 0;

        int endIndex = arr.length - 1;
        //2.使用循环完成
        while (startIndex <= endIndex) {
            //3.获取中间下标
            int midIndex = (startIndex + endIndex) / 2;
            //找打中间下标对应的元素
            int midValue = arr[midIndex];

            //当要查找的元素 > 中间下标对应的元素
            if (ele > midValue) {
                startIndex = midIndex + 1;
                //当要查找的元素 < 中间下标对应的元素
            } else if (ele < midValue) {
                endIndex = midIndex - 1;
            } else {
                //当要查找的元素 == 中间下标对应的元素
                return midIndex;
            }


        }
        return -1;
    }


}
