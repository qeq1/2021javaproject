package com.atguigu.abstracttest2;

public class Test {
    public static void main(String[] args) {

        Woman wo = new Woman();

        Man man = new Man();

        Person []ps = {wo,man};

        for (Person p : ps) {
            p.walk();
            p.eat();
            if(p instanceof Woman){
                Woman w = (Woman)p;
                w.buy();
            }
            if(p instanceof Man){
                Man m= (Man)p;
                m.smoke();
            }
        }





    }
}
