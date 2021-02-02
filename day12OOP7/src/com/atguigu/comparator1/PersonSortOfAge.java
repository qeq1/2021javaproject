package com.atguigu.comparator1;

import java.util.Comparator;

public class PersonSortOfAge implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // Object o1 = p1   Object o2 = p2;
        //制定比较规则   年龄比较
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.age - p2.age;
    }
}
