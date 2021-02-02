package com.atguigu.method.methodtest4;
/*
方法： 封装功能  实现代码的复用
    静态方法：被static修饰的方法
    非静态方法：不被static修饰的方法

不同点：
  1.调用方式不同
    静态方法通过 类名.方法名调用
    非静态方法： 对象名.方法名调用

  2.静态方法不能【直接】引用非静态的方法 或者变量
    可以通过创建对象的方式间接引用

  3.非静态方法 来者不拒 静态或者非静态的变量 方法都可以直接使用


  static:静态的内容已经随着类的加载而加载了 而此时对象可能还没有创建
        所以不能使用 对象创建后才分配内存的内容。

非静态方法：

注意：
    1.不再本类中 必须通过 对象名.方法名()调用

    2.如果在本类中 则可以省略 对象名直接调用




 */
public class Test {
    public static void main(String[] args) {
        Teacher.print();

        Teacher teacher = new Teacher();
        teacher.name = "小黄";

        Teacher.print();

        teacher.show();
/*
        teacher.sum(10, 20);


        boolean result = teacher.isOuShu(10);

        System.out.println("result==>" + result);*/


    }
}
