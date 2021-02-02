package com.atguigu.oop2.ooptest1;


/*
成员变量：
   定义在 类中方法外；



  实例变量与类变量的区别：

  1.调用方式不同：
      实例变量： 对象名.属性名
      类变量： 类名.属性名
  2.内存中份数不一样
     实例变量： 每一个对象都有一份
     类变量：  当前类 所有对象共享一份
  3.内存中的位置不同
    实例变量： 堆中
    类变量：方法区
  4.修饰不同
      实例变量： 不加static 修饰
      类变量：  加static修饰
  5.初始化的时间不同：
       实例变量：创建完对象后 就会分配空间 有值
       类变量：先有类 才会有对象 类变量的初始化时间 早于 实例变量

  6.销毁的时间不一样
     实例变量：当没有引用指向时 会被垃圾回收器回收 (GC)
     类变量：类变量的存活时间 随着类的消亡而消亡。存活时间 相较于
           实例变量 要长。





在什么时候使用 静态变量/类变量？
   多个对象出现共有属性时 开辟的空间存储的内容是相同的

   学生老师的名字

   所有人的国家名

   银行的利率
   。。。。。






 */

public class Test1 {
    public static void main(String[] args) {
        Student.country="唐朝";
        Student s1 = new Student();
        s1.age = 18;
        s1.name = "王安石";

        s1 = null;


     //   s1.country="中国";
        System.out.println("名字是："+s1.name+",年龄是："+s1.age+"，国家是："+Student.country);
        Student s2 = new Student();
        s2.name="杜甫";
        s2.age = 19;
        //s2.country = "中国";
        System.out.println("名字是："+s2.name+",年龄是："+s2.age+"，国家是："+Student.country);
    }
}
