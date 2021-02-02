package com.atguigu.fenzhuang;

/*

属性不能直接暴露给外界访问  防止出现赋值不安全

setXxx() 进行属性赋值
getXxx() 获取属性值 方法带返回值 返回值的类型与属性的类型保持一致
this:代表当前对象
     谁调用就是谁
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public void setAge(int age) {
        if(age>150 ||age <0){
            this.age = 18;
        }else{
            this.age = age;
        }

    }

    public int getAge() {
        return this.age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

}
