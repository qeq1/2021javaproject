package com.atguigu.generic.test6;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
/*

泛型的限制
？： 当使用？ 作为泛型的时候 只能 传入null值
 */
public class Test01 {

   @Test
    public void test01(){

       MyClass<?> myClass = new MyClass<>();

       /*
       myClass.setFiled(10);
       myClass.setFiled(new Date());
         */
       myClass.setFiled(null);
       /*
       无法确定孩子是哪一个  只有null是确定的
       都是number的孩子 以及number
        */
       MyClass<? extends Number> myClass1 = new MyClass<>();

      /* myClass1.setFiled(20);
       myClass1.setFiled(new Integer(90));
       myClass1.setFiled(new BigDecimal(20));*/
       myClass1.setFiled(null);
       /*
       都是number的父亲  以及Number
        */
       MyClass<? super Number> myClass2 = new MyClass<>();
       myClass2.setFiled(10);
       myClass2.setFiled(new BigDecimal(20));
       myClass2.setFiled(new Integer(20));
    }
    public void method(Object obj){





    }
}

class MyClass<T> {

    private String name;
    private T filed;

    public void setFiled(T filed) {
        this.filed = filed;
    }
}
class My{

}