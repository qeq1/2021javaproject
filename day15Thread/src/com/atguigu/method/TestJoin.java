package com.atguigu.method;

/*
5.join()

  强行插队
    插队的线程 调用 join()  那么  被插队的线程 要进行等待
    等 插队的线程 执行完毕后 才能继续执行



   插队的线程 调用 join(2000)  那么  被插队的线程 要进行等待 2000ms
    等 插队的线程 执行完毕后 或者 等待时间已到  那么继续执行



 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {

        RabbitRunnable1 rabbitRunnable1 = new RabbitRunnable1();

        Thread t1 = new Thread(rabbitRunnable1, "小白兔");

        t1.start();

        for (int i = 1; i <= 20; i++) {

            if (i == 10) {

                t1.join();

            }
            System.out.println("主线程跑\t" + i);
        }


    }
}

class RabbitRunnable1 implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "\t跑........\t" + i);

        }

    }
}