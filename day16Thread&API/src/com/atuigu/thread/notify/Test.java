package com.atuigu.thread.notify;

/*
线程通信：

1. wait(): 进行等待

2.wait(时间):

3.notify: 通知  如果有多个线程等待 则 随机通知一个线程

  notifyAll():  通知所有等待的线程 起来干活



有一个餐厅

一个服务员
一个厨师

吧台 最多放 10份菜

   如果 厨师已经做了 10份菜 则进行等待  通知 服务员上菜
   服务员上菜  当 服务员已经将所有的才 都上完了  服务员休息 通知 厨师做菜


问题1：
    大厨和服务员使用的两个吧台

    将吧台声明到test类中

问题2：
    大厨还没有做菜 翠花已经开始上菜

    保证线程安全 使用同步代码块

问题3：
    大厨做的菜 已经超出了 吧台的能力

    翠花端的菜 也是寂寞（无）


    当 吧台的菜 已经少于0 时  服务员等待

    当吧台的才 大于10时  厨师等待


   wait()释放锁

 */
public class Test {

    public static void main(String[] args) {

        Bar bar = new Bar();
        CookThread c1 = new CookThread();
        c1.setBar(bar);

        WaiterThread w1 = new WaiterThread(bar);
        c1.setName("家常菜大厨");
        w1.setName("翠花");

        c1.start();
        w1.start();
    }

}

class WaiterThread extends Thread {

    private Bar bar;

    public WaiterThread(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bar) {
                    //在进行端菜之前 进行校验
                if(bar.count<=0){
                    try {
                        bar.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                bar.count--;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "端走了一份菜 ，还有" + bar.count + "份菜");
                //通知厨师做菜
                bar.notify();
            }
        }
    }
}

class CookThread extends Thread {
    private Bar bar;

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bar) {
                //厨师在做菜之前对数据进行校验
                if(bar.count>=Bar.MAX_NUM){
                    try {
                        bar.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                bar.count++;//厨师做了一道菜
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "做了一道菜，现在有" + bar.count + "份菜");
                //通知服务员端菜
                bar.notify();
            }
        }
    }
}
class Bar {
    //只能放10份菜
    public static final int MAX_NUM = 10;
    //记录吧台上菜的数量
    int count;
}
