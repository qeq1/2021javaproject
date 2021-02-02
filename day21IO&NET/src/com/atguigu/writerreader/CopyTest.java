package com.atguigu.writerreader;

import java.io.*;

/*
复制作文：




 */
public class CopyTest {

    public static void main(String[] args) {

        Reader reader = null;
        Writer writer = null;

        try {
            //1.创建输入输出字符流对象

            reader = new FileReader("E:/作文.txt");

            writer = new FileWriter("D:/作文.txt");
            //2.读取数据
            char c[] = new char[20];

            int len = 0;
            //将数据读到字符数组内
            while ((len= reader.read(c))!=-1){
                //将读取进来的数据进行展示
                System.out.println(new String(c,0,len));
                  //3.写出数据将字符数组的数据进行写出
                writer.write(c,0,len);

            }

            writer.flush();
            //4.关闭资源

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
