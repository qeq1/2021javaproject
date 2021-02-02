package com.atuigu.thread.deadlock;

/*
死锁：（了解）



采购原材料

 发货  付款

  货到 付款

 账期  先给货 再付款
------------------------------------------

供货商
  先给钱  再发货
超市
  先给货  再给钱


产生死锁的原因 两条线程 互相持有对方的锁资源  不放松


可以让一条线程先跑完  另一条线程 再开始
 */
public class TestDeadLock {

    public static void main(String[] args) throws InterruptedException {

        Object goods = new Object();
        Object money = new Object();

        GoodsThred g1 = new GoodsThred(goods, money);
        CustomerThread c1 = new CustomerThread(goods, money);

        g1.start();
        Thread.sleep(1000);
        c1.start();
    }
}

class GoodsThred extends Thread {

    Object goods;
    Object money;

    public GoodsThred(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
    //g1 c1
        synchronized (money) {
            System.out.println("先给钱");

            synchronized (goods) {
                System.out.println("再 发货");
            }
        }

    }
}

class CustomerThread extends Thread {
    Object goods;
    Object money;

    public CustomerThread(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        //g1 c1
        synchronized (goods){
            System.out.println("先发货");
            synchronized (money){
                System.out.println("再给钱");
            }

        }
    }
}