package com.atguigu.create;

public class RabbitRunnable implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("兔子跑。。。。。。。");
        }
    }
}
