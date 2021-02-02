package com.atguigu.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*

Collection 无序 不唯一
     ---set  无序 唯一

       ---HashSet  无序 唯一

       --LinkedHashSet
                  有序：添加顺序
                  唯一：元素唯一

       --TreeSet  有序：自然顺序
                  唯一：元素唯一

注意：
    相较于Collection没有新增方法
    使用Set集合存储自定义类型数据 需要去重写 hashCode() equals();

 */
public class SetTest1 {

    @Test
    public void test01() {

        /**
         * 无序： 不是添加的顺序
         * 唯一：元素唯一
         */
        Set<String> set = new HashSet();

        set.add("JAVA");
        set.add("HTML");
        set.add("HTML");
        set.add("PYTHON");
        set.add("PYTHON");
        set.add("CSS");

        System.out.println(set);

        System.out.println("set.size() = " + set.size());
        System.out.println("set.isEmpty() = " + set.isEmpty());

        System.out.println("set.contains(\"CSS\") = " + set.contains("CSS"));

        set.remove("CSS");
        //清空集合
        set.clear();
        System.out.println(set);
    }

    @Test
    public void test02() {

        Set<Integer> set = new HashSet();
        set.add(10);
        set.add(20);
        Set<Integer> s1 = new HashSet<>();
        s1.add(66);
        s1.add(88);
        set.addAll(s1);
        System.out.println(set);
        set.retainAll(s1);
        System.out.println(set);
    }
    @Test
    public void test03() {
        Set<String> set = new HashSet();

        set.add("JAVA");
        set.add("HTML");
        set.add("PYTHON");

        for (String s : set) {
            System.out.println(s);
        }


        System.out.println("--------------------------------");


        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String ele = iterator.next();
            System.out.println(ele);
        }
        System.out.println("--------------------------------");
    }

    @Test
    public void test04() {
        Set<Person> set = new HashSet<>();


        set.add(new Person("张三", 18));
        set.add(new Person("李四", 20));
        set.add(new Person("张三", 18));

        System.out.println(set.size());

        System.out.println(set);


    }
}

class Person implements Comparable<Person> {

    String name;

    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}