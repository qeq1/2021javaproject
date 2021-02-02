package com.atguigu.poly3;

/*

多太的向上转型和向下转型 都是针对于 编译时类型 运行时类型 从始至终 不会发生改变

多太的向上转型和向下转型：

1.继承
2.方法重写
3.父类的引用指向子类的实例
 向上转型 up-casting
 Animal ani = new Cat();
 弊端：不能使用子类所独有的资源。

 向下转型：使用子类自己所独有的资源的时候  down casting
        前提：已经完成了向上转型
       小的数据类型 标识符 =（小的数据类型）大的数据类型的数值

 注意：1.不是所有的类型都可以相互转化
        借助于 instanceof 关键字进行判断

      2.想要使用子类自己所独有的资源（方法 属性） 必须向下转型

 回忆：
    byte  short int long  float double  --->

    double float long int short byte  ---> 强制转换

    小的数据类型 标识符 =（小的数据类型）大的数据类型的数值。





 */
public class Test {
    public static void main(String[] args) {

        Animal ani = new Dog();
        ani.eat();
        System.out.println("====>"+ani.name);//Animal

        Dog dog = (Dog) ani;

        dog.lookHome();
        //  ani.catchMouse();
        System.out.println("---------------------------------------------");

        Animal a1 = new Cat();

        System.out.println("a1.name = " + a1.name);
        a1.eat();
// 小的数据类型 标识符 =（小的数据类型）大的数据类型的数值。
        Cat cat = (Cat) a1;
        cat.catchMouse();
        System.out.println("cat.name = " + cat.name);


    }
}
