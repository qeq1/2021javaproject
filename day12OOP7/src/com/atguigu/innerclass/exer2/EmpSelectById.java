package com.atguigu.innerclass.exer2;

public class EmpSelectById implements Predicate {
    @Override
    public boolean test(Object obj) {

        Employee e1 = (Employee)obj;

        if(e1.getId()>=3){
            return true;
        }
        return false;
    }
}
