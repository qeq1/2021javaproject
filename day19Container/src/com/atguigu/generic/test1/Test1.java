package com.atguigu.generic.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*
泛型： 类型化参数
      想到 实参 和形参

泛型的好处：
      1.可以节约代码
      2.可以让代码的可读性更强
相关的名字：
      T: type 类型

      E: Element 元素

      K: key

      V： value

      Map<K,V>

      不同的字母代表为了见名之意  都是代表 类型未知

- GenericArrayType：泛化的数组类型，即T[]
- ParameterizedType：参数化类型，例如：Comparator<T>，Comparator<String>
- TypeVariable：类型变量，例如：Comparator<T>中的T，Map<K,V>中的K,V
- WildcardType：通配符类型，例如：Comparator<?>等

泛型可以写在哪里？

  类上   泛型类  ArrayList<Integer>
               LinkedList
  接口上  泛型接口
           public interface List<E>
  方法上  泛型方法
      当方法真正执行的时候 才确定是什么类型
       public static <T> boolean addAll(Collection<? super T> c, T... elements) {}
       注意：泛型方法的泛型声明 放到了 返回值之前
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);

        Collections.addAll(list, 10);
        LinkedList<String> list1;

        ArrayList<String> list2 = new ArrayList<>();
        list2.add(10+"");


        Collections.addAll(list2, "20","李白");


    }
}
