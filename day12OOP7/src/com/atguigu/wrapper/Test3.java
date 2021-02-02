package com.atguigu.wrapper;

/*

基本类型数据与包装类之间的转换：


1. 基本类型数据---> 包装类型
  方式一：通过 构造器
      Integer 标识符=  new Integer(基本类型数据);
  方式二：
      Inteher 标识符 = Integer.valueOf(基本类型数据)
  老方法：
  新方法 直接采用自动装箱 直接将 基本类型数据 赋值为引用类型的对象
       Integer in = 基本类型数据。
       自动装箱的底层 采用的是 Integer.valueOf(a);
2.包装类型---> 基本类型数据
   方法一： 调用包装类对象的 intValue();


   方法二：自动拆箱
          直接将 引用类型数据 变为基本类型数据

          基本数据类型  标识符 = 包装对象；



 */
public  class Test3 {
    public static void main(String[] args) {
        int a = 10;
        Integer i1 = a;
        Integer i2 = Integer.valueOf(a);
        Integer i3 = 10;
        System.out.println("-----------------------------------");
        Integer i4 = new Integer(20);
        //  int i = i4.intValue();
        int i = i4;
        System.out.println("-----------------------------------");
        //自动装箱
        Byte b = 20;

        Byte b1 = new Byte("20");
        //自动拆箱
        byte b2 = b1;

        Double d = 3.14;

        Double d1 = new Double(2.56);

        double d2 = d1;


    }
}
