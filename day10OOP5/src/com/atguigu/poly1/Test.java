package com.atguigu.poly1;
/*
通过吃饭 揭示 多态的好处

多态：
   1.有继承

   2.有方法的重写

   3.有父类的引用 指向子类的实例（对象）

 */
public class Test {
    public static void main(String[] args) {
       Chinese ch = new Chinese();
        showEat(ch);
       Indian indian = new Indian();
        showEat(indian);
        English english = new English();
        showEat(english);
        Japan japan = new Japan();
        showEat(japan);
    }

    public static void showEat(Programmer programmer){//Programmer programmer = indian;
        programmer.eat();

        if(programmer instanceof Chinese){
            Chinese ch = (Chinese)programmer;
            ch.play();
        }

        if(programmer instanceof Indian){
            Indian in  = (Indian)programmer;
            in.play();
        }

        if(programmer instanceof Japan){
            Japan japan = (Japan) programmer;
            japan.play();
        }

        if(programmer instanceof English){

            English en = (English)programmer;

            en.play();
        }




        //programmer.play();
    }

/*
    private static void showEat(English english) {
        english.eat();
    }
    private static void showEat(Indian indian) {
        indian.eat();
    }
    private static void showEat(Chinese ch) {
        ch.eat();
    }*/
}
