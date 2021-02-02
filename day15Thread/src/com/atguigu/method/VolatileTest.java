package com.atguigu.method;

public class VolatileTest {
/*
    volatile： 保证线程的可见性
 */

    static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag) {
                   // System.out.println("66666666666");
                }
            }
        }).start();


        Thread.sleep(1000);

        flag = false;

    }
}
