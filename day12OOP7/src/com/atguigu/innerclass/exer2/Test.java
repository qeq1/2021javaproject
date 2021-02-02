package com.atguigu.innerclass.exer2;


public class Test {
    public static void main(String[] args) {






        EmployeeService employeeService = new EmployeeService();

       /* Employee[] employees = employeeService.get(new Predicate() {
            @Override
            public boolean test(Object obj) {
                return true;
            }
        });*/


        Predicate p = new Predicate() {
            @Override
            public boolean test(Object obj) {
                Employee e1 = (Employee) obj;

                if (e1.getAge() > 25) {
                    return true;
                }
                return false;
            }
        };
        Employee[] employees = employeeService.get(p);

        for (Employee employee : employees) {
            if(employee!=null){//去除null值
                System.out.println(employee);
            }

        }


    }
}
