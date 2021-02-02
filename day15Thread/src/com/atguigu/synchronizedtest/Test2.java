package com.atguigu.synchronizedtest;
/*
采用实现的方式
   采用同步代码块 完成 线程安全问题；

 */
public class Test2 {

    public static void main(String[] args) {

        WindowRunnable windowRunnable = new WindowRunnable();
        Thread t1 = new Thread(windowRunnable, "窗口一");
        Thread t2 = new Thread(windowRunnable, "窗口二");
        Thread t3 = new Thread(windowRunnable, "窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}

class WindowRunnable implements Runnable {

    int count = 60;

    @Override
    public void run() {
        // t1 t2 t3

        while (true) {
            synchronized ("") {
                if (count <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖了第" + count + "张票");
                count--;
            }
        }
    }
}
