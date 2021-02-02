package com.atguigu.io;

import org.junit.Test;
import java.io.*;

/*
复制一个文件


try(
 需要关闭资源的对象
){
}catch(){

}
只要实现了 此 AutoCloseable 接口 就可以使用 try-with-resourse 新特性
jdk1.7 提出

 */
public class TestCopy {

    @Test
    public void test02() {
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\2021javaproject\\day06OOP1\\src\\Student.java"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/c.txt"));



        ) {
            byte[] b = new byte[1024];

            int len = 0;

            while ((len = bis.read(b)) != -1) {

                bos.write(b, 0, len);
            }
            bos.flush();

            System.out.println("写出完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void test01() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.新建流对象
            bis = new BufferedInputStream(new FileInputStream("E:\\2021javaproject\\day06OOP1\\src\\Student.java"));
            bos = new BufferedOutputStream(new FileOutputStream("E:/a.txt"));
            //2.对数据读 写
            byte[] b = new byte[1024 * 10];
            int len = 0;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);

            }
            bos.flush();
            //3.关闭流

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {

                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
