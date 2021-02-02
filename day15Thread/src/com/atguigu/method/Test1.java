package com.atguigu.method;

/*

此时 有三条线程

1.主线程

2.小白兔线程

3.小灰兔线程
    isAlive（）： 判断当前线程是否处于活动状态
    setPriority(优先级)：
           1<= 优先级 <= 10
           如果没有指定优先级 则 默认的优先级 都是 5
     优先级特别低 也会有执行的机会
     先去执行 优先级高的 再去执行优先级低的

4.Thread.sleep(数字)： 让当前线程 睡眠一段时间
                       单位是ms


 */
public class Test1 {

    public static void main(String[] args) {
        RabbitRunnable rabbitRunnable = new RabbitRunnable();

        Thread t1 = new Thread(rabbitRunnable, "小白兔");
        Thread t2 = new Thread(rabbitRunnable, "小灰兔");
        // System.out.println("t1.isAlive() = " + t1.isAlive());
        t1.setPriority(10);
        t2.setPriority(1);

        System.out.println(t1.getPriority());

        t1.start();
        t2.start();
        //   System.out.println("t1.isAlive() = " + t1.isAlive());


    }
}

class RabbitRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
          //run方法出现异常 只能 采用    try {}catch(){}方式处理  因为子类不能抛出比父类更大的异常
            // 而Runnable中 run()没有抛出异常
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "跑。。。。。");
        }
    }
}
