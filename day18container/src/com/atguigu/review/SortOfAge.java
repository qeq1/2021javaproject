package com.atguigu.review;

import java.util.Comparator;

public class SortOfAge implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.age-p2.age;
    }
}
