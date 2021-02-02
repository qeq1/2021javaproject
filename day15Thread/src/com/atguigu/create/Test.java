package com.atguigu.create;
/*
使用 实现的方式创建多线程

1.创建一个类型 实现  Runnable接口

2.重写run()方法

3.创建 Runnable  对象

4.  创建Thread对象 将 Runnable对象 作为参数进行传递

5. 调用start()方法 启动线程。


继承的方式与 实现的方式做对比：
 1.继承的方式 简单

 2.实现的方式 可以更好的实现 资源共享



 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        //1.创建Runnable对象
     /*   RabbitRunnable rabbitRunnable = new RabbitRunnable();
        //2.创建Thread类 将 Runnable对象 作为参数进行传递
        Thread t1 = new Thread(rabbitRunnable);
        t1.start();//开启线程*/

        TortiseThread tortiseThread = new TortiseThread();
       // TortiseThread tortiseThread1 = new TortiseThread();

        tortiseThread.start();

        Thread.sleep(2000);



    }
}

class TortiseThread extends Thread{

    int num;

    @Override
    public void run() {



        while (true){



            System.out.println("乌龟跑。。。。。。。。。。。");
        }
    }
}
