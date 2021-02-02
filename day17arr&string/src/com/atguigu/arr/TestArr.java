package com.atguigu.arr;

import org.junit.Test;

public class TestArr {

    @Test
    public void test1() {
        //当原来的数组长度不够了需要扩容，例如需要新增位置来存储10
        //新建一个旧数组
        String[] strArr = {"张三", "李四", "王五"};
        //扩容 伏笔 以后会有集合的扩容
        //扩容到原来的2倍
        // String[] newArr = new String[strArr.length*2];
        String[] newArr = new String[strArr.length + 1];
       /* for (int i = 0; i < strArr.length; i++) {
            newArr[i] = strArr[i];
        }*/

        System.arraycopy(strArr, 0, newArr, 0, strArr.length);

        //新增元素
        newArr[3] = "赵六";

        //把新数组的地址 赋给 旧数组
        strArr = newArr;


        for (String s : strArr) {

            System.out.print(s);
        }

    }


    @Test
    public void test2() {
        //数组元素的插入  数组未满  数组已满

        String[] arr = new String[5];
        //String[] arr = {"蔡旭坤","肖战","王一博"};
        arr[0] = "蔡旭坤";
        arr[1] = "肖战";
        arr[2] = "王一博";

        //下标为1的位置插入元素
        System.arraycopy(arr, 1, arr, 2, 2);

        arr[1] = "赵四";


        for (String s : arr) {

            System.out.print(s + "\t");
        }

    }

    @Test
    public void test03() {
        //当数组已满 再次插入元素 要进行扩容
        String[] arr = {"蔡旭坤", "肖战", "王一博"};
        //下标为1的位置插入元素  广坤

        int index = 1;
        //新建新的数组
        String[] newArr = new String[arr.length + 1];
        //将改变之前的元素复制到数组内

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        System.arraycopy(arr, 1, newArr, 2, 2);
        //将插入的新元素 放到新数组内
        newArr[1] = "广坤";
        //可以将新数组的地址 赋值给旧数组
        arr = newArr;
        for (String s : arr) {
            System.out.print(s + "\t");
        }

    }

    @Test
    public void test04() {
//数组元素的删除
        String[] arr = {"蔡旭坤", "肖战", "王一博"};

        /*
         思路一：
         新建一个新数组 存储俩元素
         将删除之前的元素 蔡旭坤 放到新数组内
         将删除之后的元素 王一博  放到新数组内
         将新数组的地址给旧数组

        思路二：

        将arr作为移动数组的战场

        删除肖战 实际上就是将 王一博 向前移动一位

        再将 王一博的位置 变为null
         */

        System.arraycopy(arr, 2, arr,1 , 1);

        arr[2] = null;


        for (String s : arr) {
            System.out.print(s);
        }







    }

}
