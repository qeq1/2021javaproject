package com.exception.exer;

public class Account {
    //账户
    private String account;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    /**
     * 取钱的方法
     *
     * @param money
     */
    public void quMoney(int money) {
        //取款金额为负数
        if (money < 0) {
            throw new IllegalArgumentException("取款金额,不能为负数：" + money);
        }

        //     当取款金额大于余额时
        if (money > balance) {
            throw new UnsupportedOperationException("取款金额不足，不支持当前操作");
        }
        //正常取款
        balance -= money;
    }

    /**
     * 存钱操作
     * @param money
     */
    public void saveMoney(int money){
        //存款金额 是负数
        if (money < 0) {
            throw new IllegalArgumentException("存款金额,不能为负数：" + money);
        }

        //把钱添加到余额
        balance+=money;

    }

}
