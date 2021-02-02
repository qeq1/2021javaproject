package com.atguigu.exer;

/*
新建一个账户类  有一个属性 余额 600
有一个方法是取款

创建两条线程 取钱

张三  500
张三媳妇 500
进行输出那一条线程 取款成功 那一条线程 取款失败。
 */
public class AccountTest {

    public static void main(String[] args) {

        AccountRunnable accountRunnable = new AccountRunnable();

        Thread t1 = new Thread(accountRunnable, "张三");
        Thread t2 = new Thread(accountRunnable, "张三媳妇");

        t1.start();
        t2.start();


    }
}

class Account {
    int balance = 600;

    public void withDraw(int money) {
        balance -= money;
    }
}
class AccountRunnable implements Runnable {
    //创建账户
    Account account = new Account();

    @Override
    public void run() {

        synchronized (account){
            if (account.balance > 500) {//判断余额是否充足
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //充足 取钱
                account.withDraw(500);
                System.out.println(Thread.currentThread().getName() + "取款成功，余额是：" + account.balance);
            } else {
                System.out.println(Thread.currentThread().getName() + "取款失败，余额是：" + account.balance);
            }
        }
    }
}
