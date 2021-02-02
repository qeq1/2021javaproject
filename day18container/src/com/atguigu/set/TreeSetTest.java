package com.atguigu.set;

import com.atguigu.review.SortOfAge;
import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {


    @Test
    public void test01() {

        Set<Integer> set = new TreeSet<>();
        set.add(1000);
        set.add(10);
        set.add(20);
        set.add(-1);
        set.add(100);
        System.out.println(set);
    }

    @Test
    public void test02() {
        Set<String> set = new TreeSet<>();
        set.add("a");
        set.add("z");
        set.add("d");
        set.add("c");
        System.out.println(set);
    }

    @Test
    public void test03() {

        Set<Person> set = new TreeSet<>();
        set.add(new Person("张三", 18));
        set.add(new Person("李四", 20));
        set.add(new Person("李四", 20));
        set.add(new Person("王五", 22));
        set.add(new Person("赵六", 19));
        System.out.println(set);
    }

    @Test
    public void test04() {
    /*    SortOfStudent sortOfAge = new SortOfStudent();
        Set<Student> set = new TreeSet<>(sortOfAge);//Comparator c =sortOfAge;*/

        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        set.add(new Student(98.3, 18, "张三"));
        set.add(new Student(98.2, 9, "王五"));
        set.add(new Student(98.4, 9, "赵六"));
        set.add(new Student(98.1, 19, "李四"));
        System.out.println(set);

    }
}

class SortOfStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //首先按照年龄排序 从小到大
        //当年龄一致的时候 按照分数排序 从小到大
        if (o1.getAge() == o2.getAge()) {
            return Double.compare(o1.getSocre(), o2.getSocre());
        }
        return o1.getAge() - o2.getAge();
    }
}

class Student {

    private double socre;
    private int age;
    private String name;

    public Student() {
    }

    public Student(double socre, int age, String name) {
        this.socre = socre;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (Double.compare(student.getSocre(), getSocre()) != 0) return false;
        if (getAge() != student.getAge()) return false;
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getSocre());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAge();
        result = 31 * result + getName().hashCode();
        return result;
    }

    public double getSocre() {
        return socre;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "socre=" + socre +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
