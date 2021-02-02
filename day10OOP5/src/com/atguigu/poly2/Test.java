package com.atguigu.poly2;

import java.util.Scanner;

/*
有一个程序员工厂

按需生产程序员  中国  日本  印度的

模拟招聘



多态的三个点：

1.应用到形参

2.多态数组
  父类[] arr = {父类对象,子类对象};

3.多态应用于方法的返回值类型

public 父类类型  方法名（）{
return 子类对象（）；

}

 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请问您需要哪一个国家的程序员？");
        Scanner in = new Scanner(System.in);
        String result = in.next();//中国  印度  日本

        //System.out.println("中国".equals("中国1"));
      // Programmer programmer  =
        Programmer programmer = GuiGuFactory.productProgrmmer(result);// Japan  Chinese  Indain

        if (programmer != null) {
            programmer.coding();
        }else{
            System.out.println("还没有此国家的程序员");
        }


    }
}
