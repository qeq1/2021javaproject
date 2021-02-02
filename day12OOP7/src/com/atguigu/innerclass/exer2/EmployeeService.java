package com.atguigu.innerclass.exer2;

public class EmployeeService {

    Employee[] arr;

    public EmployeeService() {
        arr = new Employee[5];
        arr[0] = new Employee(4, "李四", 24, 24000);
        arr[1] = new Employee(3, "张三", 23, 13000);
        arr[2] = new Employee(5, "王五", 25, 15000);
        arr[3] = new Employee(1, "赵六", 27, 17000);
        arr[4] = new Employee(2, "钱七", 16, 6000);
    }

    /*
     根据 条件不同 拿到的数据不一样
    输出满足要求的数据
    id >= 3 员工
     */

    public Employee[] get(Predicate p) {// Predicate p = 子类对象

        Employee[] es = new Employee[5];
        //定义变量 记录一共有几个满足要求的数据
        int count = 0;
        //遍历数组
        for (Employee employee : arr) {
            //进行筛选
           if( p.test(employee)){
               //将满足要求的数据放到数组内
               es[count++] = employee;
           }
        }
/*

返回的元素 可能存不满
 id >= 3 员工  3个员工

 两种方案：

    1.对次数组再次进行处理
      新建一个长度为count的数组
    2.再输出数据时进行筛选 去除 元素为null的

 */
        return es;
    }
}
