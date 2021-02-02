package com.atguigu.objectstream;

import org.junit.Test;

import java.io.*;

/*
对象流 进行对象的存取

  -- 对象输出流
    ObjectOutputStream
  -- 对象输入流
    ObjectInputStream

序列化： 如果将一个对象 进行存储或者网络传输 那么要将此对象进行序列化
       如何实现序列化： 实现此接口 Serializable
       会将对象数据采用二进制的形式存到磁盘上


反序列化： 将对象从磁盘或者网络中读取出来 反序列化


注意：
   1.如果有属性不想进行序列化 可以选择 在属性前 + transient 短暂的

   2.static 修饰的属性 不会参与序列化

  3. 在进行序列化或者反序列化 序列化的版本必须一致
     private static final long serialVersionUID = 2L;
   4.在进行反序列化时 对象类的class文件 不能消失 必须存在

 */
public class ObjectStreamTest {

    @Test
    public void test01() throws IOException {
        //创建对象
        Person p = new Person("李白", 18, 1.81);
        p.setCountry("china");

        System.out.println(p);

        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/obj.txt"));
        //写出对象
        oos.writeObject(p);
        //关闭流
        System.out.println("写出完毕");
        oos.close();
    }

    @Test
    public void test02() throws IOException, ClassNotFoundException {
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/obj.txt"));
        //读取对象
        Object object = ois.readObject();
        System.out.println(object);
        //关闭资源
        ois.close();
    }

}

class Person implements Serializable {
    private static final long serialVersionUID = -3117036515993124255L;
    String name;

    transient int age;

    double score;

    static String country;

    public  void setCountry(String country) {
        Person.country = country;
    }

    public Person(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +" country=  "+country+
                " ,name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
