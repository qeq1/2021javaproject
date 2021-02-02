package com.exception.method;

/*
方法重写：
  1.权限修饰符不能比父类更加严格  >= 父类的访问权限

  2.返回值类型
     基本类型数据  必须与父亲保持一致

     引用类型数据  可以是父类 也可以是父类的孩子

     形参列表 必须保持一致

     子类不能抛出比父类更大的异常

     注意：编译时异常有效


 */
public class MethodTest {


    public static void main(String[] args) throws Exception {

        Father father = new Son();
        try {
            father.show(6);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class Son extends Father {
    @Override
    public void show(int id) throws RuntimeException {

        if(id<10){
            throw new ArrayIndexOutOfBoundsException("您输入的数字太小了");
        }


        System.out.println("this is son show()");
    }
}

class Father {
    public void show(int id) throws Exception {
        System.out.println("this is show()");
    }

    public void method() throws Exception{

        throw new Exception("哈哈哈");

    }
}