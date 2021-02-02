package com.atguigu.innerclass.exer;

import java.util.Comparator;

public class EmpSortOfSalary implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
      //  return (int)(e1.getSalary()-e2.getSalary());

        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
