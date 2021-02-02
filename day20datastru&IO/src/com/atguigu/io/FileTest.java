package com.atguigu.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
File: 可以表示一个文件或者一个（目录）文件夹

 */
public class FileTest {
    @Test
    public void test01() {
        //File file  = new File("E:/2.txt");
       // File file = new File("E:\\temp\\2.txt");
        //File.separator:盘符分割的方式2
        File file = new File("E:"+File.separator+"temp"+File.separator+"2.txt");
        System.out.println(file);
        boolean exists = file.exists();
        System.out.println(exists);
    }

    @Test
    public void test02(){
        File file = new File("E:\\201021java\\day20数据结构&IO\\笔记\\1.7JDK.png");


        long length = file.length();
        System.out.println(length);//获取 文件的长度 单位是字节
        //获取文件的名字
        String name = file.getName();

        System.out.println(name);
        String path = file.getPath();
        //E:\201021java\day20数据结构&IO\笔记\1.7JDK.png
        System.out.println(path);
       //2020-11-17 15:10:16
        long l = file.lastModified();
        System.out.println(new Date(1605597016809L).toLocaleString());//
    }


    @Test
    public void testpath1() throws IOException {
        File file = new File("E:\\201021java\\day20数据结构&IO\\笔记\\1.7JDK.png");
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());

    }

    @Test
    public void testpath2() throws IOException {
        File file = new File("hello.java");
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());

    }

    @Test
    public void testpath3() throws IOException {
        /*
        getPath()：构建路径 相对路径
        getAbsolutePath（）： 获取绝对路径 ****
        getCanonicalPath（）：获取规范路径


         */

        File file = new File("../../../hello.java");
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());

    }

    @Test
    public void test03() throws IOException {

        File file = new File("E:/six.txt");
        //新建一个文件 创建成功 返回 true
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        boolean newFile1 = file.createNewFile();
        System.out.println(newFile1);

        //删除的内容不经过回收站  慎用
        boolean delete = file.delete();
        System.out.println(delete);
    }

    @Test
    public void test04(){
        File file = new File("E://AA//BB//CC");

        //可以创建多层目录
        file.mkdirs();
      //  file.mkdir();
        //删除空的文件夹
     //   file.delete();
    }

}
