package com.atguigu.method;
/*
守护线程：
    t1.setDaemon(true);
    哪一个线程 调用了 setDaemon（true） 则此线程 就是一个守护线程

    isAlive():判断当前线程是否处于 活跃状态
    setPriority();设置当前线程的优先级
                 1<= 优先级 <=10
                 默认的优先级 5
     join();调用此方法的线程 强行插队

     stop(); 结束当前线程
     setDaemon(true); 设置守护线程



    Thread.sleep(数字ms): 让当前线程进入阻塞状态
           .yield() 线程的礼让  让当前线程 运行状态 ===> 就绪状态

 */
public class Test3 {
    public static void main(String[] args) {

        RabbitRunnable3 rabbitRunnable3 = new RabbitRunnable3();



        Thread t1 = new Thread(rabbitRunnable3, "Musice");
        //zai start（）之前调用setDaemon
        t1.setDaemon(true);



        t1.start();



        for(int i = 1;i<=30;i++){

            System.out.println("我在打游戏打游戏打游戏"+i);

        }



    }
}

class RabbitRunnable3 implements Runnable{


    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"====>播放音乐。。。。");
        }
    }
}