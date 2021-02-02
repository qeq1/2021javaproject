package com.atguigu.enum2;

public enum Gender implements Run{
    MAN{
        @Override
        public void run() {
            System.out.println("男生 大步流星走.....");
        }
    },WOMAN{
        @Override
        public void run() {
            System.out.println("女士 婀娜多姿走.....");
        }
    };
   /* @Override
    public void run() {
        System.out.println("走啊走。。。。。。");
    }*/
}

interface Run{

    void run();

}