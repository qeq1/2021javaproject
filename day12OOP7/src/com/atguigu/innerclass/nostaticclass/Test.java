package com.atguigu.innerclass.nostaticclass;
/*
非静态内部类：
  不加static修饰的 内部类

  外部类 类名{

  [权限修饰符] class  内部类名{

  }
  }
特点：

   1.非静态内部类可以直接使用外部类所有的资源
        静态与非静态资源
        私有与非私有资源

   2.外部类使用内部类的资源
      1.首先创建非静态内部类的对象 然后才能使用内部类中的资源
      2.如果是内部类中的静态常量 则可以直接使用
      3.外部类的静态方法 不能使用内部类资源

   3.非静态内部类中不能存在静态的方法静态的属性
     但是可以存在静态的常量


   4.有几个非静态内部类 就会生成几个字节码文件
     外部类名$内部类名

   5.每一个类中都有一个this 代指当前对象
     获取外部类中的this  外部类名.this.属性名



 */
public class Test {
    public static void main(String[] args) {
       //  Outer outer = new Outer();
       // Outer.Inner inner = outer.new Inner();
       //  System.out.println(outer.num);
        //使用非静态内部类对象
        Outer.Inner inner = new Outer ().new Inner();
        inner.innerMethod2();
    }
}
