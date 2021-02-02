package com.atguigu.changevalue;

/**
 * 交换数组内的值
 */
public class ChangeValueTest {

    public static void main(String[] args) {

        String[] arr = {"范冰冰", "蔡旭坤"};
        System.out.println("changValue（）调用前：arr[0]:" + arr[0]);//
        changValue(arr);
        System.out.println("changValue（）调用后：arr[0]:" + arr[0]);//
    }

    public static void changValue(String[] arr) {
        arr[0] = "韩红";
        arr = new String[]{"谢广坤", "赵四"};
        System.out.println("changValue（）调用中：arr[0]:" + arr[0]);
    }
}
