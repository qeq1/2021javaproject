package com.atguigu.anno;

import java.util.Date;

/*

注释： 解释说明 给 程序员看的

注解：主要是给编译器看的
     人也能看懂


常用注解：
   @Override  判断当前方法是不是重写的方法

   @Deprecated
           标记类 或者方法过时
           过时指的是 不推荐使用  使用不会报错
   @SuppressWarnings
           抑制警告
 */
public class Annotest {

    @SuppressWarnings("all")
    public static void main(String[] args) {

        Date date = new Date();
      //  date.toLocaleString();

        TestKK kk = new TestKK();
        kk.show();


    }
}

class Father {
    public void show(Father father) {

    }


}
@SuppressWarnings("all")
class Son extends Father {

    @Override
    public void show(Father father) {

    }
    public void show(Son father) {

    }
}
@SuppressWarnings("all")
class Daughter extends Father {


    @Override
    public void show(Father father) {
        super.show(father);
    }
}