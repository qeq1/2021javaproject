package com.atguigu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/*
UDP： 非面向连接
     不可靠的
     一次只能最大发送64Kb的数据

 DatagramSocket: 客户端/服务端

 DatagramPacket：数据包

 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------------------Server-------------------------");
        //服务端
        DatagramSocket dsServer = new DatagramSocket(8888);
        //准备数据包
        byte b[] = new byte[1024*20];
        DatagramPacket packet = new DatagramPacket(b,b.length);
        //接收数据
        dsServer.receive(packet);
        //有效数据的个数
        System.out.println("packet.getLength() = " + packet.getLength());
        //获取发送数据包的客户端的端口号  当 客户端没有指定端口时  系统会随机分配一个端口
        System.out.println("packet.getPort() = " + packet.getPort());
        //获取客户端的地址
        System.out.println("packet.getAddress() = " + packet.getAddress());
        //获取发送过来的数据
        System.out.println("packet.getData() = " + packet.getData());
        System.out.println("packet.getData() = " + Arrays.toString(packet.getData()));

        String s = new String(b,0,packet.getLength());
        System.out.println(s);


    }
}
