package com.atguigu.getset;
/*


如果将属性直接暴露给外界
外界在传值的时候 只需要满足语法就可以了
在做项目的时候 不仅要符合语法 还要符合业务逻辑

解决：
    1.让属性私有 不直接暴露给外界

    2.属性私有后 不能直接被访问 需要通过 setXxx方法 setAge()

    3.属性私有后 通过getXxx()方法进行访问    getAge()


 */
public class Test {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.setName("李白");
        String name = t1.getName();
        System.out.println("name = " + name);
        t1.setAge(1110);
        System.out.println("t1.getAge() = " + t1.getAge());

        System.out.println("------------------------------------");

        Teacher t2 = new Teacher("杜甫", 229);
        t2.info();


    }
}
