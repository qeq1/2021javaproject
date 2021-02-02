package com.atguigu.reflect.lazyinit;
/*
类的初始化的滞后
    1.当使用类中的静态常量的时候 不会触发 类的初始化
       因为在类的加载阶段 完成了 对静态常量的赋值
    2.当子类使用从父类继承过来的静态方法时  只会对父类完成 类的初始化 子类 不会进行初始化
    3.创建一个类型的数组时  不会触发对该类的初始化
 */
public class TestLazy {
    public static void main(String[] args) {

      //  System.out.println("Father.name = " + Father.name);

       // Son.show();

        Father[] fathers = new Father[20];

        System.out.println(fathers[0]);



    }

}

class Father{
    static {
        System.out.println("Father 完成了初始化");
    }
    public static final   String name = "李白";



  public   static void  show(){
      System.out.println("this is show()");
  }
}
class Son extends Father{
    static {
        System.out.println("Son 完成了初始化");
    }


}
