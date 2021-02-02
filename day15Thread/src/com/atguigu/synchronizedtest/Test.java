package com.atguigu.synchronizedtest;

/*
解决线程安全问题 方式一  使用同步代码块

    synchronized(同步监视器对象){



    }

同步监视器对象：
    1.必须是引用数据类型
    2.当多条线程操作共享数据 同步监视器对象 必须是同一个
    3.同步代码的意义
       w1 w2 w3 都被CPU调度  都要执行run()
       发现有同步代码块  假设 w1 进到了同步代码块
       w2 w3 只能在同步代码块外进行等待 w1 卖完 60张票之后
       w2 w3 w1   w3 进到了同步代码块  那么 w1 和 w2 只能在外部等待


      保正在 同步代码块内只有一条线程 在执行 其他线程 需要在 同步代码块外等待

      当一条线程进入同步代码块内 那么 其他线程 不能进入 拥有 同一个同步监视器对象的同步代码块







 */
public class Test {

    public static void main(String[] args) {

        WindowThread w1 = new WindowThread("窗口一");
        WindowThread w2 = new WindowThread("窗口二");
        WindowThread w3 = new WindowThread("窗口三");

        w1.start();
        w2.start();
        w3.start();

    }
}

class WindowThread extends Thread {
    static int count = 60;

    public WindowThread(String name) {
        super(name);
    }

    static Object obj = new Object();
    // String name = "哈哈";

    @Override
    public synchronized void run() {


        while (true) {
            // w1  w2  w3
           // synchronized (obj) {//Class
                if(count<=0){
                    break;
                }
                //我进来了
                if (count > 0) {
                    System.out.println(this.getName() + "卖了第" + count + "张票");
                    count--;
                }
          //  }
        }
    }
}