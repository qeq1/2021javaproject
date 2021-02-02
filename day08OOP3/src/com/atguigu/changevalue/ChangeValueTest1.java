package com.atguigu.changevalue;

/*
需求： 通过方法交换俩数的位置

基本类型数值传递：传递的是值的副本。
 */
public class ChangeValueTest1 {


    public static void main(String[] args) {
        int num1 = 66;
        int num2 = 88;
        System.out.println("changValue（）调用前：num1:" + num1 + ",num2:" + num2);// 66 88
        changValue(num1, num2);
        System.out.println("changValue（）调用后：num1:" + num1 + ",num2:" + num2);//88 66
    }

    public static void changValue(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("changValue（）调用中：num1:" + num1 + ",num2:" + num2);//88 66
    }
    public static int[] cc(int m,int n){
        int [] arr = {m,n};
        return arr;


    }


}
