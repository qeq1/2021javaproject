package com.atguigu.scoket3;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("==========================服务端==========================");
        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.获取对应的客户端socket
        Socket socket = serverSocket.accept();
        System.out.println(socket.getInetAddress().getHostName()+":"+socket.getInetAddress());

        //3.获取输入流
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //写出数据使用输出流
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);

        //4.读取客户端的消息
        String s = "";//hello
        while ((s=br.readLine())!=null){
            System.out.println("客户端发来的消息是："+s);
            //将客户端传递的消息 存到 StringBuilder内
            StringBuilder sbl = new StringBuilder(s);
            //5.将客户端消息进行处理  反转
             sbl.reverse();

            //6.将处理后的消息
            //7.使用输出流 返回给客户端
            ps.println(sbl.toString());
        }

        //8.关闭资源
        ps.close();
        br.close();
        socket.close();
        serverSocket.close();
    }

    @Test
    public void test01(){
        StringBuilder sba = new StringBuilder("hello");
        sba.reverse();
        System.out.println(sba);
    }
}
