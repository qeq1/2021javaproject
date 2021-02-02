package com.atguigu.utils;


import com.atguigu.comparator1.PersonSortOfAge;

import java.util.Comparator;

public class SortUtils {

    /**
     * 接收所有引用类型数据
     * 通用的排序方法
     *
     * @param objArr
     */
   /* public static void sort(Object[] objArr) {//Object arr = student;
        for (int i = 0; i < objArr.length - 1; i++) {
            for (int j = 0; j < objArr.length - 1 - i; j++) {
                Comparable s = (Comparable) objArr[j];
                Comparable s1 = (Comparable) objArr[j + 1];
                //当前一个数大于后一个数
                if (s.compareTo(s1) > 0) {
                    Object temp = objArr[j];
                    objArr[j] = objArr[j + 1];
                    objArr[j + 1] = temp;
                }
            }
        }
    }
*/

    public static void sort(Comparable[] objArr) {//Comparable arr = student;
        for (int i = 0; i < objArr.length - 1; i++) {
            for (int j = 0; j < objArr.length - 1 - i; j++) {
                //当前一个数大于后一个数
                if (objArr[j].compareTo(objArr[j + 1]) > 0) {
                    Comparable temp = objArr[j];
                    objArr[j] = objArr[j + 1];
                    objArr[j + 1] = temp;
                }
            }
        }
    }
    /**
     * @param objArr 要排序的数组
     * @param com 比较规则
     */
    public static void sort(Object[] objArr, Comparator com){

        for(int i = 0;i<objArr.length-1;i++){
            for(int j = 0;j<objArr.length-i-1;j++){
                if(com.compare(objArr[j],objArr[j+1])>0){
                    Object obj = objArr[j];
                    objArr[j] = objArr[j+1];
                    objArr[j+1] = obj;
                }
            }


        }

    }




}
