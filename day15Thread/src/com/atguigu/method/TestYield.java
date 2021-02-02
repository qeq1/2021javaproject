package com.atguigu.method;
/*

yield(); 线程的礼让
        将线程 从 运行状态 ===》 就绪状态
stop():结束线程
 */
public class TestYield {
    public static void main(String[] args) {
        /*RabbitRunnable2 rabbitRunnable = new RabbitRunnable2();

        Thread t1 = new Thread(rabbitRunnable, "兔子线程");

        t1.start();*/

        TortiseThread tortiseThread = new TortiseThread();
        tortiseThread.setName("乌龟线程");
        tortiseThread.start();

        for (int i = 1; i <=20 ; i++) {
            System.out.println("主线程跑："+i);
        }
    }
}

class RabbitRunnable2 implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=20;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"===>跑"+i);
        }

    }
}

class TortiseThread extends Thread{

    @Override
    public void run() {

        for (int i = 0; i <20; i++) {

            if(i==15){
                this.stop();
            }
            System.out.println(this.getName()+"跑。。。。。"+i);

        }
    }
}
