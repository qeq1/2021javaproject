package com.atguigu.innerclass.anosclass;

import org.junit.Test;

/*
使用内部类:
1.在完成内部类的声明的时候  已经创建了内部类的对象

2.匿名内部类创建的是子类对象 可以使用子类重写父类的方法 已经从父类继承过来的资源

3.可以使用接口或者抽象类作为形参 传递一个子类对象
 */
interface Fly {
    void fly();
}

class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("小鸟会飞。。。。。。。。");
    }
}

public class TestAnosClass2 {
    @Test
    public void test05() {

      /*  Bird bird = new Bird();
        method1(bird);*/
/*

new Fly() {
            @Override
            public void fly() {
                System.out.println("超人会飞");
            }
        }
        创建了一个子类对象
 */
//多态
       /* Fly ff = new Fly() {
            @Override
            public void fly() {
                System.out.println("超人会飞");
            }
        };

        method1(ff);*/

       method1(new Fly() {
           @Override
           public void fly() {
               System.out.println("我是超人我会飞");
           }
       });
    }

    public static void method1(Fly f) {//Fly  f = 一个子类对象;
        //真正的子类对象调用方法
        f.fly();
    }

    @Test
    public void test04() {

        Fly fly = new Fly() {
            @Override
            public void fly() {
                System.out.println("飞飞");
            }
        };
        fly.fly();
    }

    @Test
    public void test03() {

        Object obj = new Object() {
            public void method1() {
                System.out.println("this is method");
            }
        };

    }


    @Test
    public void test02() {

//多态
        Father1 father1 = new Father1(66) {
            @Override
            public void test() {
                System.out.println("this is Son()");
            }
        };
        father1.test();
        father1.show();
        System.out.println(father1.num);


    }

    @Test
    public void test01() {

        new Father1() {
            @Override
            public void test() {
                System.out.println("this is son test()");
            }
        }.test();
    }


}


class Father1 {
    int num;

    public Father1() {
    }

    public Father1(int num) {
        this.num = num;
    }

    public void test() {
        System.out.println("this is Father test()");
    }

    public void show() {
        System.out.println("this is Father Show()");
    }
}