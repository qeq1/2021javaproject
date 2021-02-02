package com.atguigu.bufferstream;

import java.io.*;

/*

使用字节缓冲输入输出流复制文件

 */
public class BufferedCopy {

    public static void main(String[] args) throws IOException {


        long startTime = System.currentTimeMillis();
        //1.创建输入输出流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\software\\Ra2_Yuri(2in1).7z"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/Ra2_Yuri(2in1).7z"));
        //2.读取数据
        //创建字节数组 提高 读取的速度
        byte[] bytes = new byte[1024 * 200];

        int len = 0;

        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();
        System.out.println("复制完毕");
        long endTime = System.currentTimeMillis();

        System.out.println("用时" + (endTime - startTime));
        //3.关闭资源
        bis.close();
        bos.close();
    }
}
