package com.atguigu.create2;

public class TestCreate {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("乌龟跑。。。。。。。。");
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("兔子跑");
                }
            }
        }).start();
    }


    private static void create1() {
        //创建了一个匿名子类对象
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("乌龟跑。。。。。。。。");
                }

            }
        };
        t1.start();


        Thread t2 = new Thread(new Runnable() {//创建了一个 Runnable的匿名子类对象
            @Override
            public void run() {
                while (true) {
                    System.out.println("兔子跑");
                }

            }
        });
        t2.start();
    }


}
