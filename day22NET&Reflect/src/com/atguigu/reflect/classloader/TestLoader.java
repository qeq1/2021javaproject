package com.atguigu.reflect.classloader;
/*
类的加载器： 加载类的

引导类加载器：
  加载java的核心类库  jre/rt.jar
  String
扩展类加载器
   它负责加载jre/lib/ext扩展库
应用程序加载器  AppClassLoader
   Person
   Student
自定义类加载器
   需要自主加载的内容

双亲委托：
   先由当前类加载器 查看是否加载过这个类 如果没有加载过

   父类加载器 会查看 是否加载过这个类  继续向上传递

   根加载器 没有加载过这个类    ClassNotFoundException

 */
public class TestLoader {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<String> aClass = String.class;
        System.out.println(aClass.getClassLoader());//null
        Class<TestLoader> t = TestLoader.class;
        System.out.println("t.getClassLoader() = " + t.getClassLoader());


        Class clazz = Class.forName("com.atguigu.reflect.classloader.Person");
        System.out.println("clazz.getClassLoader() = " + clazz.getClassLoader());
    }


}

class A{


}

class B{

    A parent;

    public void setParent(A parent) {
        this.parent = parent;
    }
}

class CPU{
    String name;

}
class KeyBoard{
}
class Computer{
    CPU cpu;
    KeyBoard keyBoard;

}
