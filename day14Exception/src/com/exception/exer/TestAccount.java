package com.exception.exer;

public class TestAccount {
    public static void main(String[] args) {

        Account account = new Account("110110110", 1000);



        //取钱
        try {
         //   account.quMoney(-90);
          //  account.quMoney(100);

            account.saveMoney(90);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Game Over!!!");



    }
}
