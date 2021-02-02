package com.atguigu.objectstream;

import org.junit.Test;

import java.io.*;
/*
使用此接口  Externalizable 也可以进行序列化 和反序列化操作
    序列化时 会调用此方法
    public void writeExternal(ObjectOutput out) throws IOException {}

    反序列化时 会调用此方法
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {}


使用此接口 任意属性都可以被序列化








 */

public class Test2 {

    @Test
    public void test01() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/obj.txt"));
        Student s1 = new Student("李白", 18, 99);
        s1.setCounntry("中国");
        oos.writeObject(s1);

        System.out.println("写出成功");
        oos.close();
    }

    @Test
    public void test02() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/obj.txt"));
        Object object = ois.readObject();
        System.out.println(object);

    }
}

class Student implements Externalizable {
    private static final long serialVersionUID = 3701184753997522666L;
    String name;

    transient int age;

    static String counntry;

    double score;

    public void setCounntry(String counntry) {
        Student.counntry = counntry;
    }

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{ counntry=" + counntry +
                " ,name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeUTF(name);
        out.writeUTF(counntry);
        out.writeInt(age);
        out.writeDouble(score);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        name = in.readUTF();
        counntry = in.readUTF();
        age = in.readInt();
        score = in.readDouble();


    }
}
