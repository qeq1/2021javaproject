package com.atguigu.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
客户端
1.创建客户端对象

2.获取输出流


3.发送数据

4. 关闭资源


 */
public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("=======================客户端=======================");

        //1.创建客户端socket对象
        // host：将数据发送给那一台电脑  port: 发送给哪一个程序
        //Socket socket = new Socket("127.0.0.1", 8888);
        //Socket socket = new Socket("localhost", 8888);
        // Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        //关闭防火墙
        Socket socket = new Socket(InetAddress.getByName("192.168.30.1"), 8888);


        //2.获取输出流对象
        OutputStream os = socket.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);
        //3.写出数据

        dos.writeUTF("小丽，晚上有时间没 给家讲 java");

        //4.关闭客户端socket 关闭流
        dos.close();
        socket.close();
    }
}
