package com.atguigu.coll1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Collection3 {
    @Test
    public void test01() {
        Collection c1 = new ArrayList();
        c1.add("abc");
        c1.add("def");

        for (Object obj : c1) {// Object obj = "abc";
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }
    }

    @Test
    public void test02() {
/*
泛型 ：规定你输入数据的类型
     Collection<引用数据类型>
 */
        Collection<String> c2 = new ArrayList<>();
        c2.add("李白");
        c2.add("杜甫");
        c2.add("王安石");
        System.out.println(c2);
  /*
   ConcurrentModificationException
   同步修改异常
   */
        for (String s : c2) {
            if (s.equals("李白")) {
                c2.remove("杜甫");
            }
        }
        System.out.println(c2);

    }

    @Test
    public void test03(){
        /*
        modCount:记录 集合操作的次数
        在进行集合遍历的时候  不要使用 集合对象 直接 新增或者删除元素
        删除的时候 使用 iterator 去操作。
         */
        ArrayList<Integer> c1 = new ArrayList<>();
        c1.add(10);
        c1.add(11);
        c1.add(12);
        c1.add(13);
      //  c1.remove(10);
        System.out.println(c1);
        Iterator<Integer> it = c1.iterator();
        //ConcurrentModificationException
        //ConcurrentModificationException
        while (it.hasNext()){
            Integer num = it.next();
            if(num%2==0){
                //c1.remove(num);
               it.remove();
            }
        }
        System.out.println(c1);
    }
}
