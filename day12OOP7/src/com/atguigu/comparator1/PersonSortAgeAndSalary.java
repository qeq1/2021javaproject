package com.atguigu.comparator1;

import java.util.Comparator;

public class PersonSortAgeAndSalary implements Comparator {
    /*
    当年龄一致按照薪水排序
    首先 年龄 从小到大
    年龄一致 按照薪水 从小到大
     */
    @Override
    public int compare(Object o1, Object o2) {

        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        //年龄相等时
        if(p1.age==p2.age){
          /*  if(p1.salary - p2.salary >0){

                return 1;
            }else if(p1.salary - p2.salary <0){
                return -1;
            }else{
                return 0;
            }*/
          return Double.compare(p1.salary, p2.salary);
        }

        //年龄不相等时 使用年龄比较
        return p1.age - p2.age;
    }
}
