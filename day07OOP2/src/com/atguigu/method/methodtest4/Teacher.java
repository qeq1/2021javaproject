package com.atguigu.method.methodtest4;

public class Teacher {
    public String name;

    public int age;

    static String country;

    public void show(){
        System.out.println("this is show");
        sum(30, 40);
    }

    public static void print(){
        System.out.println("show print()");


    }

    public void sum(int a,int b){

        int sum = a+b;
        System.out.println(sum);
    }

    /**
     * 判断数是不是偶数
     * @param num
     * @return
     */
    public boolean isOuShu(int num){

        if(num%2==0){
            return true;
        }

       return false;
    }

}
