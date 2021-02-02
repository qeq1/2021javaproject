package com.atguigu.socket2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws Exception {
       //1.创建客户端对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //2.获取输出流
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        //3.写出数据到服务端
        ps.println("晚上有时间没？ 一起学习");
        //4.获取输入流
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        //5.读取服务端发来的消息
        String s = br.readLine();
        //6.展示信息

        System.out.println("服务端发来的消息是："+s);
        //7.关闭资源

        br.close();
        ps.close();
        socket.close();



    }
}
