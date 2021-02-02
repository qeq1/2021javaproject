package com.atguigu.bufferstream;

import org.junit.Test;

import java.io.*;

/*
字节【缓冲】流
  -- 字节输入缓冲流
     底层采用8192的（byte）字节数组 存储数据

  -- 字节输出缓冲流
      底层采用8192的（byte）字节数组 存储数据
 */
public class BufferStreamTest {

    @Test
    public void test01() throws FileNotFoundException {
        //节点流
        InputStream is = new FileInputStream("E:/w.txt");
        //处理流
        BufferedInputStream bis = new BufferedInputStream(is);

        new BufferedInputStream(is,1024*20);

    }

    @Test
    public void test02() throws FileNotFoundException {
        OutputStream os = new FileOutputStream("e:/cc.txt");

        BufferedOutputStream bos = new BufferedOutputStream(os);

    }
}
