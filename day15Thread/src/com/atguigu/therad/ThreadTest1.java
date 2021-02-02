package com.atguigu.therad;

/*

 Thread(String name)
 使用继承的方式 可以采用this 调用 父类的资源 getName();


 要有一个类实现Runnable 接口
 Thread t1 = new Thread(tortiseRunnable);
 Thread t2 = new Thread(tortiseRunnable, "绿毛龟");


 */
public class ThreadTest1 {
    public static void main(String[] args) {

/*
        RabbitThread t1 = new RabbitThread("白兔子线程");
        t1.setName("白白兔子。。。。。");
        RabbitThread t2 = new RabbitThread("灰兔子线程");
        t1.start();
        t2.start();*/

        TortiseRunnable tortiseRunnable = new TortiseRunnable();

        Thread t1 = new Thread(tortiseRunnable);
        t1.setName("小乌龟");
        t1.start();

        Thread t2 = new Thread(tortiseRunnable, "绿毛龟");
        t2.start();

    }
}

class TortiseRunnable implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i <100; i++) {
            System.out.println(Thread.currentThread().getName()+"跑");
        }
    }
}


class RabbitThread extends Thread {

    public RabbitThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + "===>跑");
        }
    }
}

