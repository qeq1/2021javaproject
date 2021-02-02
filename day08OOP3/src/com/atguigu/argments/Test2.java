package com.atguigu.argments;

public class Test2 {
    public static void main(String[] args) {

        //sum(10,20,30,40);
    }
    public static void sum(int... arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void sum(int a,int...arr){


    }

  /*  public static void sum(int[] arr){

        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);

    }*/


}
