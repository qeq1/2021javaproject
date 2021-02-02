package com.atguigu.interfacetest2;


public interface A {
    int x =0;//public staic final
}
class B{
    int x =1;
}
class C extends B implements A{
    public void px(){
        System.out.println(A.x);
        System.out.println(super.x);
    }
}
