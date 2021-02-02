package com.atguigu.socket4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        System.out.println("======================服务端======================");
        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.获取对应的客户端的socket对象
        int count = 1;
        while (true) {

            Socket socket = serverSocket.accept();

            String hostName = socket.getInetAddress().getHostName();

            System.out.println(hostName + "来连接了，您是第[" + (count++) + "]个连接的"+socket.getInetAddress());

            SocketThread thread = new SocketThread(hostName, socket);
            //启动线程
            thread.start();
        }
    }
}

class SocketThread extends Thread {
    private Socket socket;
    private String name;

    public SocketThread(String name, Socket socket) {
        super(name);
        this.name = name;
        this.socket = socket;
    }

    @Override
    public void run() {

        try (
                //1.接收客户端的信息 输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //2.向客户端反馈消息 输出流
                PrintStream ps = new PrintStream(socket.getOutputStream());
        ) {

            //3.使用循环 不停的接收消息
            String mess = "";
            while ((mess = br.readLine()) != null) {
                System.out.println("客户端【 " + name + " 】发来的消息：" + mess);
                //4.将消息进行翻转
                StringBuilder sbl = new StringBuilder(mess);

                sbl.reverse();

                //5.返回给客户端
                ps.println(sbl.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
