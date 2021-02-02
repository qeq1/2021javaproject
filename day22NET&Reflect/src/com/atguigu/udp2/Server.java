package com.atguigu.udp2;


import com.sun.beans.editors.ByteEditor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("==================服务端=====================");

        //1.创建服务端对象
        DatagramSocket dsServer = new DatagramSocket(8888);
        //2.准备数据包

        byte[] bs = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bs,bs.length);

        //3.接收数据
        dsServer.receive(packet);
        //4.输出数据
        String s = new String(bs, 0, packet.getLength());
        System.out.println("客户端发来的数据："+s);
        //5.返回数据给客户端
        byte[] bytes = "鹅鹅鹅".getBytes();
        // 客户端发来的数据包中有客户端的ip地址 和端口号
        DatagramPacket sendPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),packet.getPort());
        //6.将数据发送给客户端
        dsServer.send(sendPacket);









    }
}
