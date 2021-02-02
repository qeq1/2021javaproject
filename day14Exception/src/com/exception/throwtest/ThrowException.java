package com.exception.throwtest;

import com.sun.xml.internal.txw2.output.IndentingXMLFilter;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

/*
处理异常的方式二：
   通过throw 抛

     throw new 异常的类型（自定义异常的输出信息）；

     System.err.println(); //红颜色输出信息  位置有可能会颠倒

 注意：
    1.如果是运行时异常 则 直接throw 即可

    2.如果是编译时异常 那么必修在throw 后  在方法的声明处 通过throws 表名 由调用此方法的方法 处理异常

    3.throws 在方法的声明处 告诉调用我方法的方法 随便掉  但是 需要处理 我声明的异常

    4.throw 一次只能抛出一个异常对象

      throw下面不能存在其他的内容

 */
public class ThrowException {


    @Test
    public void test02() {
        try {
            showMessage(2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Game Over");
    }

    public static void showMessage(int index) throws FileNotFoundException, ArrayIndexOutOfBoundsException, InputMismatchException {

        File file = new File("E:\\201021java\\day13异常+线程\\笔记\\异常信息1.png");

        boolean exists = file.exists();
        //当文件不存在时进入分支
        if (!exists) {
            throw new FileNotFoundException("文件不存在");
        }
        System.out.println(exists);
        int[] arr = {10, 20, 30};

        if (index < 0 || index >= arr.length) {

            throw new ArrayIndexOutOfBoundsException("数组下标越界啦" + index);

        }
        System.out.println("指定下标的元素是：" + arr[index]);


    }


    @Test
    public void test01() {


        try {
            show(12);
        } catch (ArrayIndexOutOfBoundsException e) {
            //  e.printStackTrace();
            System.err.println(e.getMessage());
        }
        //   show(12);
        System.out.println("Game Over");

    }


    public static void show(int index) {

        int[] arr = {10, 20, 30};

        if (index < 0 || index >= arr.length) {

            throw new ArrayIndexOutOfBoundsException("数组下标越界啦" + index);

        }
        System.out.println("指定下标的元素是：" + arr[index]);

    }

}
