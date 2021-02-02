package com.exception.mineexception;

public class Person {

    private String name;


    private int age;

    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) throws AgeException {
        this.name = name;
      //  this.age = age;
        this.setAge(age);
      //  this.sex = sex;

        this.setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {

        if(age>=1 && age <=150){
            this.age = age;
        }else{
            throw new AgeException("年龄不符合要求"+age);
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {

        if(sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else{
            throw new SexException("性别要明确小伙子： "+sex);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
