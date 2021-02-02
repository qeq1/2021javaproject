package com.atguigu.single;

/*

设计模式： 前任总结的一套代码模板
          23种设计模式   单例模式  观察者模式 发布订阅模式  装饰模式 .....

 单例模式： 包装产生的对象是唯一的  无论创建多少个对象 都是唯一的

 饿汉式：
      一开始 创建类的时候 就把 此对象创建出来

 懒汉式：
     等到需要的时候 再次创建出来

     懒汉式 可能出现线程安全问题

 */
public class Test {
    public static void main(String[] args) {


        Single i1 = Single.INSTANCE;
        Single i2 = Single.INSTANCE;
        System.out.println(i1 == i2);
        Single1 i3 = Single1.INSTANCE;
        Single1 i4 = Single1.INSTANCE;
        System.out.println(i3 == i4);
        System.out.println("-----------------------------------------------");


        LazySingle i5 = LazySingle.getInstance();

        LazySingle i6 = LazySingle.getInstance();

        System.out.println("i5==i6 = " + (i5 == i6));
    }
}


class Single {
    public static final Single INSTANCE = new Single();

    private Single() {

    }
}

enum Single1 {
    INSTANCE
}

class LazySingle {
    private static LazySingle lazySingle;
    private LazySingle() {
    }
    public static  LazySingle getInstance(){

        if(lazySingle==null){

            lazySingle = new LazySingle();
        }
        return lazySingle;
    }

/*
    public static synchronized LazySingle getInstance() {

        if (lazySingle == null) {
            synchronized (Test.class){
                if(lazySingle==null){
                    lazySingle = new LazySingle();
                }
            }
        }
        return lazySingle;
    }
*/
}