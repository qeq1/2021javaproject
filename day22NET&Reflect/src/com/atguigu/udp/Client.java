package com.atguigu.udp;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------------------Client-------------------------");

        //1.新建客户端对象
        DatagramSocket ds = new DatagramSocket();

        //1.1准备数据包
        String mess = "abcd";
        byte[] bytes = mess.getBytes();
        // 数据  目的地 ip地址  端口号
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8888);
        //2.发送数据
        ds.send(packet);
    }

}
