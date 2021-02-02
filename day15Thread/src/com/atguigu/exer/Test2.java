package com.atguigu.exer;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        //创建接口对象
        PrintRunnable printRunnable = new PrintRunnable();

        //作为参数传递到Thread类

        Thread t1 = new Thread(printRunnable, "自定义线程");

        t1.start();

        for (int i = 1  ; i <=10 ; i++) {

            if(i==5){

                t1.join();
            }

            System.out.println(Thread.currentThread().getName()+"--->  "+i);

        }
    }
}

class PrintRunnable implements Runnable{

    Scanner in = new Scanner(System.in);

    @Override
    public void run() {

        while (true){
            System.out.println(Thread.currentThread().getName()+" 是否结束？Y/y:结束");
            /*String result = in.next();

            if(result.equals("Y")|| result.equals("y")){
                break;
            }*/
            char result = in.next().charAt(0);
            if(result=='Y'|| result=='y'){
                break;
            }

        }

    }
}
