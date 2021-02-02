package com.atguigu.net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    @Test
    public void test01() throws UnknownHostException {
        //获取本地的主机名和ip地址
        InetAddress in = InetAddress.getLocalHost();
        //sixfly/10.10.30.127
        System.out.println(in);//获取的是主机名 以及端口号
        String hostName = in.getHostName();
        System.out.println("hostName = " + hostName);
        String address = in.getHostAddress();
        System.out.println("address = " + address);
    }

    @Test
    public void test02() throws UnknownHostException {
        InetAddress address = InetAddress.getByName("wwww.atguigu.com");
        System.out.println(address);
    }

    @Test
    public void test03() throws UnknownHostException {
        byte[] b = {(byte) 192, (byte) 168, 30, 55};
        //采用int类型存储
        InetAddress byAddress = InetAddress.getByAddress(b);
        System.out.println(byAddress);

    }
}
