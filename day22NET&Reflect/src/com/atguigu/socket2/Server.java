package com.atguigu.socket2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
双向通信 ：
客户端发送来一条信息

服务端返回一条信息
 */
public class Server {

    public static void main(String[] args) throws IOException {
        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(9999);

        //2.获取对用的客户端socket

        Socket socket = serverSocket.accept();

        //3.获取输入流
        InputStream is = socket.getInputStream();
        //将字节流变为字符流
        InputStreamReader reader = new InputStreamReader(is);
        //将字符流--> 缓冲字符流
        BufferedReader br = new BufferedReader(reader);

        //4.读取客户端发来的消息
        String s = br.readLine();
        System.out.println("客户端发来的消息："+s);

        //5.获取输出流

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        //6.写出数据到客户端
        ps.println("我有时间 晚上 不见不散");

        //7.关闭资源
        ps.close();
        br.close();
        socket.close();



    }
}
