package com.atguigu.reflect.initclass;

/*

1.调用该类的main() 会导致 该类完成初始化
2.当创建子类对象时  会先进行父类的初始化
3.使用类中的静态资源时 会 进行类的初始化
4.创建一个类的对象时 会 进行该类的初始化
5.使用反射操作此类时 会进行该类的初始化

 */
public class TestInit {

  /*  static {
        System.out.println("TestInit类完成初始化");
    }*/

    public static void main(String[] args) throws ClassNotFoundException {


      //  new Son();

       // System.out.println("Father.name = " + Father.name);

      //  Father.show();

     //   new Father();

        Class.forName("com.atguigu.reflect.initclass.Father");

    }
}

class Father {
    public static String name = "哈哈";

    static {
        System.out.println("Father类完成初始化");
    }

    static void show(){
        System.out.println("this is show() in Father()");
    }


}

class Son extends Father {
    static {
        System.out.println("Son类完成初始化");
    }


}
