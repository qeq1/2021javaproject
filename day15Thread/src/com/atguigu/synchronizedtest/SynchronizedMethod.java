package com.atguigu.synchronizedtest;
/*
使用同步方法 完成资源共享


  同步方法 同步监视器对象是 this

  当 有一条线程 进入 同步方法 那么 其他线程 不仅不能进入此方法

  也不能进入拥有同一个同步监视器对象的同步方法

 */

/*
新建一个账户类  有一个属性 余额 600
有一个方法是取款
创建两条线程 取钱
张三  500
张三媳妇 500
进行输出那一条线程 取款成功 那一条线程 取款失败。
 */

public class SynchronizedMethod {

    public static void main(String[] args) {
        WindowRunnable1 windowRunnable1 = new WindowRunnable1();

        Thread t1 = new Thread(windowRunnable1, "窗口一");
        Thread t2 = new Thread(windowRunnable1, "窗口二");
        Thread t3 = new Thread(windowRunnable1, "窗口三");

        t1.start();
        t2.start();
        t3.start();


    }
}


class WindowRunnable1 implements Runnable {

    int count = 60;

    @Override
    public  void run() {

        while (true) {
            if (count <= 0) {
                break;
            }
            this.saleTicket();
        }

    }

    // t1 t3
    private void saleTicket() {//this

        if (count <= 0) {
            return;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "卖了第" + count + "张票");
        count--;
    }

    private synchronized void method() {

    }
}