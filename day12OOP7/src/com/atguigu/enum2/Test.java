package com.atguigu.enum2;
/*
获取枚举对象的方法
  1.枚举类.枚举对象
    Season spring = Season.SPRING;
  2.通过valueOf方法
   Season   Season.valueOf("枚举对象的名字");
    //返回所有的枚举对象
    Season[] seasons = Season.values();

  3.注意：
  1.构造器默认私有
  2.枚举中的属性 必须位于 枚举元素的下面
  3.所有的自定义枚举 默认继承自Enum类
  4.枚举类不能再继承其他的类
  5.枚举类可以实现一个接口

  6.枚举对象 可以根据自身的需求 灵活判断是否需要自定义接口内的方法



 */
public class Test {
    public static void main(String[] args) {
        //返回所有的枚举对象
        Season[] seasons = Season.values();

        for (Season season : seasons) {
            String s = season.toString();
            System.out.println(season);
        }
        Season spring = Season.SPRING;
        System.out.println(spring);
        System.out.println("spring.name() = " + spring.name());
         //ordinal  返回在枚举列表中的下标  0 开始
        System.out.println("spring.ordinal() = " + spring.ordinal());

        System.out.println("==================================================");
        Season spring1 = Season.valueOf("SPRING");

        System.out.println(spring1);

    }
}
