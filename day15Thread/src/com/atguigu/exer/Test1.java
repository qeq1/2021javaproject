package com.atguigu.exer;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        //3 2 1 跑

        for(int i = 3;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("跑");

    }
}
