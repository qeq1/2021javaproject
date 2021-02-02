package com.atguigu.poly1;
/*

我希望 创建一个数组 既能放猫 也能放狗
 */
public class TestAnimal {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        Cat[] catArr = new Cat[2];
        catArr[0] = new Cat();
       // catArr[1] = new Dog();
        System.out.println("------------------------------------------------");
        Animal[] aniArr = new Animal[2];
        /*


        0        1

        Animal  Animal
         */

        Dog dog = new Dog();
        dog.name = "旺财";
        Cat cat = new Cat();
        aniArr[0] = dog;
        aniArr[1] = cat;
        for(Animal an:aniArr){
            an.eat();
        }



    }
}
