package com.atguigu.innerclass.exer;

import org.junit.Test;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TestEmployee {

    @Test
    public void test01() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        for (int i : arr) {
            System.out.print("排序前：" + i + "  ");
        }
        System.out.println("\n\n==============================================\n\n");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print("排序后：" + i + "  ");
        }
    }


    public static void main(String[] args) {

        Employee e1 = new Employee(1, "李白", 108978.8);
        Employee e2 = new Employee(2, "杜甫", 8998.8);
        Employee e3 = new Employee(3, "白居易", 8781.8);
        Employee e4 = new Employee(4, "王安石", 8978.9);
        Employee e5 = new Employee(5, "苏轼", 9978.8);
        Employee[] employees = {e1, e2, e3, e4, e5};

        System.out.println("排序前");
        //进行遍历
        show(employees);
        //进行排序
        // Arrays.sort

        //创建比较规则的对象
        // EmpSortOfSalary sort = new EmpSortOfSalary();

        // Arrays.sort(employees,new EmpSortOfSalary());


        Arrays.sort(employees, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
        System.out.println("排序后");
        //进行遍历
        show(employees);
    }

    public static void show(Employee[] e) {

        for (Employee employee : e) {
            System.out.println(employee);

        }
        System.out.println("=======================================");
        System.out.println("=======================================");


    }
}
