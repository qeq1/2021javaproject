package com.exception.mineexception;

public class PersonTest {

    public static void main(String[] args) {


        Person p1 = null;
        try {
            p1 = new Person("李白", 188, "男1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p1);
    }
}
