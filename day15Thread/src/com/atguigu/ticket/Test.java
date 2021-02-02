package com.atguigu.ticket;

/*
线程安全问题： 当多个线程操作共享数据 时 有可能会发生线程安全问题

解决线程安全问题：
   同步代码块:

   同步方法:

   Lock: 公平锁 非公平锁 juc

模拟 火车站 卖票 体现 线程安全问题。

注意： 局部变量 不能作为共享资源

   出现的问题 出现了0票 或者 重复的票
   需要有一个监视器 查看卖票的数据
 */
public class Test {
    public static void main(String[] args) {

        WindowThread w1 = new WindowThread("窗口一");
        WindowThread w2 = new WindowThread("窗口二");
        WindowThread w3 = new WindowThread("窗口三");

        w1.start();
        //执行run()

        w2.start();
        //执行run()
        w3.start();
        //执行run()
    }
}

class WindowThread extends Thread {

    public WindowThread(String name) {
        super(name);
    }

    static int count = 60;//一共有60张票

    @Override
    public void run() {


        while (true) {

            if (count <= 0) {//当把票卖完  关闭窗口
                break;
            }
         /*   try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(this.getName() + "卖了第" + count + "张票");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count--;
        }

    }
}
