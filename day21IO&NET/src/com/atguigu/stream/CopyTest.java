package com.atguigu.stream;

import com.sun.beans.editors.ByteEditor;

import java.io.*;

/*
完成文件的复制

图片的复制

 */
public class CopyTest {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            //  int[] arr = new int[10];
            //  arr[20]; 939,731
            //939,800
            //1.新建输入和输出流对象
            is = new FileInputStream("D:\\fun_img\\小新.gif");
            os = new FileOutputStream("E:/a.gif");
            //2.读取数据
            //新建字节数组
            byte[] b = new byte[1024 *10];
            int len = 0;
            //循环读取数据
            while ((len = is.read(b)) != -1) {
                //3.写出的是读进来的数据
                os.write(b, 0, len);
            }
            System.out.println("复制完毕");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关流
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
