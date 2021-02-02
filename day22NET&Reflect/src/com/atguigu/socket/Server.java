package com.atguigu.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务端
1.创建服务端对象

2.获取对应的客户端 socket

3.获取输入流对象

4.读取数据

5.关闭资源

 */
public class Server {
    public static void main(String[] args) throws IOException {

        System.out.println("=======================服务端=======================");
        //1.创建服务端socket对象
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.获取来连接的客户端sockt对象
        Socket socket = serverSocket.accept();//接受  线程阻塞

        System.out.println("来连接了。。。。。。。");
        //3.获取输入流对象
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //4.取出数据
        String s = dis.readUTF();
        System.out.println("客户端发来了消息：\t"+s);

        //5. 关闭资源
        dis.close();
        serverSocket.close();
    }
}
