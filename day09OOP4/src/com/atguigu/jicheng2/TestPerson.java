package com.atguigu.jicheng2;
/*
当父类的方法 不能满足子类的需求时 要进行方法的重写。

子类在使用资源时（属性（成员变量） 方法） 优先在本类中查找

当本类中没有时 才去父类中查找 一点一点向上找 直到找到Object类

Object类是所有类的父类
      如果一个类没有显示的继承另一个类 那么此类 默认继承自Object类

如何快速显示继承关系
 在需要查看的类上 右键 --> diagrams ---> show diagrams
   通过 空格 添加 想要查看的类

一个类只能继承一个类  一个类只能有一个父类



方法重写的注意点：
1.当子类重写父类的方法时  访问权限不能比父类方法的访问权限更加严格  >=父类方法的访问权限

2.返回值类型
   2.1当父类的返回值类型是基本类型数据时 则 子类必须与父类保持一致

   2.2当父类的返回值类型是引用类型数据时  则 子类可以是返回父类 也可以返回子类

3.方法重写时 子类的形参必须与父类的形参保持一致  否则 就相当于在子类中新增一个方法

4.关于异常  子类不能抛出比父类更大的异常（讲异常时 再进行测试）。


 */
public class TestPerson {

    public static void main(String[] args) {

        MaXiaoMing maXiaoMing = new MaXiaoMing();

        maXiaoMing.walk();
/*
        maXiaoMing.eat();


        maXiaoMing.walk();

        maXiaoMing.show();

        maXiaoMing.hashCode();*/
    }
}
