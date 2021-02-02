package com.atguigu.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {


    @Test
    public void test04() {

        File file = new File("E:\\201021java\\day00\\课件");
        listFiles(file);
    }

    static void listFiles(File file) {

        File[] files = file.listFiles();//列出当前目录内 所有的文件夹 或者文件

        for (File f : files) {
            if(f.isFile()){//是文件
                System.out.println(f.getName()+"\t"+f.length()+"\t"+new Date(f.lastModified()).toLocaleString());
            }else{
                //当是文件夹的话 继续进行迭代 找到当前文件夹内的 目录 或者 文件
                System.out.println("this is 文件夹："+ f.getName());
                listFiles(f);
            }
        }
    }
    @Test
    public void test01() {

        File file = new File("E:\\a.txt");

        file.setWritable(false);

    }

    @Test
    public void test02() {

        File f = new File("E:\\201021java\\day00\\课件\\part2\\第6章 面向对象基础（中）");
        //返回的是文件的名字 字符串类型的数组
        String[] list = f.list();

        for (String s : list) {
            System.out.println(s.toUpperCase());
            System.out.println(s);
        }


    }

    @Test
    public void test03() {
        File f = new File("E:\\201021java\\day00\\课件\\part2\\第6章 面向对象基础（中）");

        //返回的是file
        File[] files = f.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName() + "this is  文件");
            }
            if (file.isDirectory()) {
                System.out.println(file.getName() + "this is  文件夹");
            }
        }
    }

    @Test
    public void test08() throws IOException {

        File f = new File("E:/aaa.txt");

        f.createNewFile();


    }

}
