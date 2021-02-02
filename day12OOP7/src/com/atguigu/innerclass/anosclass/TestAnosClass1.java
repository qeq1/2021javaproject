package com.atguigu.innerclass.anosclass;

import org.junit.Test;

/*
匿名内部类：没有名字的类
匿名对象：没有名字的对象

方式一：
    new 父类（）{
        重写父类的方法
    }
    创建了一个子类 但是 子类是没有名字的

方式二：
  new 父类（实参列表）{
        重写父类的方法
  }
  创建了一个子类 但是 子类是没有名字的
方式三：
   new 父接口(){
    重写接口中的方法
   }
  创建了一个子类 但是子类是没有名字的
注意：
1.  匿名内部类 也会 生成独立的字节码文件
  外部类的名字$ 序号.class
2. 匿名内部类 不可以存在静态的变量 但是可以存在 静态的常量
 */
interface Run {
    void run();
}

abstract class Animal {

    abstract void eat();

}

public class TestAnosClass1 {

    @Test
    public void test04(){
        new Animal(){
            int num =20;

          final   static int age = 90;

            @Override
            void eat() {
                System.out.println("this is eat()");
            }
        };




    }

    @Test
    public void test03() {
        new Run() {
            @Override
            public void run() {
                System.out.println("this is run()");
            }
        };


    }


    @Test
    public void test01() {
        new Father() {
            @Override
            public void show() {
                System.out.println("this is Mine show()");
            }
        };
    }

    @Test
    public void test02() {


        new Father(20) {
            @Override
            public void show() {
                System.out.println("this is Mine show2(20)");
            }
        };

    }

}

class Father {
    int num;

    public Father() {
    }

    public Father(int num) {
        this.num = num;
    }

    public void show() {
        System.out.println("this is father show()");
    }
}
