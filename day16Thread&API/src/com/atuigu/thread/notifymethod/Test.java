package com.atuigu.thread.notifymethod;

/*

同步方法也有同步监视器对象  this
  this 必须是相同的

线程通信方法 必须位于 同步方法或者 同步代码块内

 */
public class Test {

    public static void main(String[] args) {

        Bar bar = new Bar();

        CookRunnable c1 = new CookRunnable(bar);
        Thread t1 = new Thread(c1, "川菜大厨");
        Thread t4 = new Thread(c1, "粤菜大厨");
        WaiterRunnable w1 = new WaiterRunnable(bar);
        Thread t2 = new Thread(w1, "翠花");
        Thread t3 = new Thread(w1, "秋雅");


        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}

/**
 * 厨师的 runnable
 */
class CookRunnable implements Runnable {

    private Bar bar;

    public CookRunnable(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        while (true) {
            bar.put();
        }
    }
}
/**
 * 服务员runnable
 */
class WaiterRunnable implements Runnable {

    private Bar bar;

    public WaiterRunnable(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        while (true) {
            bar.get();
        }
    }


}