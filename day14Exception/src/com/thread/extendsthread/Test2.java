package com.thread.extendsthread;
/*
Thread.currentThread().getName(): 获取当前线程的名字
创建两条线程:
 采用 继承的方式 创建 多线程
 1.创建一个类 继承 Thread 类


 2.重写run()方法  创建多线程 做的事情


 3.启动线程

   创建线程对象
     RabbitThread rabbitThread = new RabbitThread();
   使用线程对象调用 start()；完成启动

 */
public class Test2 {
    public static void main(String[] args) {
        //创建兔子线程
        RabbitThread rabbitThread = new RabbitThread();

        rabbitThread.setName("小兔子 ");

       // rabbitThread.run();

        rabbitThread.start();

        Thread.currentThread().setName("小乌龟");

        while (true){
            System.out.println(Thread.currentThread().getName()+"跑。。。。。。。。。");
        }








    }
}
