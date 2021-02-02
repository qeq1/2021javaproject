package com.atguigu.udp2;

import java.io.IOException;
import java.net.*;

/*
使用UDP 完成双向通信

 */
public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("-----------------------Client------------------------");
        //1.创建客户端对象
        DatagramSocket ds = new DatagramSocket();
        //2.准备数据包
        byte[] bytes = "睡醒没有".getBytes();

        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);
        //3.发送数据包
        ds.send(packet);

        //准备数据包 存储服务端反馈的消息

        //4.接收服务端 反馈的消息

        byte[] b = new byte[1024];
        DatagramPacket recivePacket = new DatagramPacket(b, b.length);
        ds.receive(recivePacket);
        //输出服务端反馈给客户端的信息
        System.out.println(new String(b, 0, recivePacket.getLength()));


    }
}
