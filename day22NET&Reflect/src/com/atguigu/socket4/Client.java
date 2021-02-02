package com.atguigu.socket4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("==========================客户端==========================");
        //1.创建客户端对象
        Socket socket = new Socket("localhost", 9999);
        //2.获取输出流
        PrintStream ps = new PrintStream(socket.getOutputStream());
        //3.获取输入流 用于接收消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //3.写出数据 n条
        //4.创建Scanner 进行自定义数据输出
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("请输入您要发送给服务端的信息");
            String message = in.next();
            //5.判断信息是否为“stop”
            if(message.equalsIgnoreCase("stop")){//STOP equalsIgnoreCase 忽略大小写的比较
                break;
            }
            //如果不是stop 再将信息 发送给 服务端
            ps.println(message);
            //6.接收服务端反馈的消息
            String result = br.readLine();
            //7.输出服务端反馈的消息
            System.out.println("服务端反馈的消息是： "+result);

        }
        //8.关闭资源
        br.close();
        ps.close();
        socket.close();
    }
}
