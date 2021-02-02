package com.atuigu.thread.notifymethod;

public class Bar {

    public static final int MAX_NUM = 10;

    int num;//统计做了多少到菜


    /**
     * 做菜
     */
    public synchronized void put() {
        //1.当做的菜 比最大值还大 停下 等待

        while (num >= MAX_NUM) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //2.做菜
        num++;
        System.out.println(Thread.currentThread().getName() + " 做了一道菜，现在有" + num + "道菜");
        //3.通知服务员端菜
        this.notify();
        //  this.notifyAll();
    }


    /**
     * 端菜
     */
    public synchronized void get() {
        //1.吧台没有菜的时候 停下等待  q
        if (num <= 0) {
            try {
                this.wait();//q c
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //2.吧台有菜 端菜
        num--;
        System.out.println(Thread.currentThread().getName() + "端走了一道菜，还有" + num + "道菜");

        //3.通知大厨做菜
        this.notify();
        //this.notifyAll();

    }
}
