package com.atguigu.comparator1;
/*
如何使用外部比较器比较：
外部比较器： 因为在 比较对象类的外面 新建了一个类专门用于比较
1.定义一个类  实现 Comparator接口
public class PersonSortOfAge implements Comparator {}
2.重写compare()传递两个参数
3.制定比较规则
4.先去创建 比较规则的对象
 通过对象调用 compare（） 再传入对象

 */


import com.atguigu.utils.SortUtils;

public class Test {

    public static void main(String[] args) {

        Person p1 = new Person("李白", 18, 10000.1);
        Person p2 = new Person("111", 20, 9999.9);
        Person p3 = new Person("2222", 21, 9999.9);
        Person p4 = new Person("333", 20, 8888.99);
        Person p5 = new Person("4444", 22, 9999.9);
        //创建比较规则的对象
        PersonSortOfAge sortOfAge = new PersonSortOfAge();
        int num = sortOfAge.compare(p1, p2);

        System.out.println("num = " + num);

        System.out.println("-----------------------------------------------------");
        Person[] ps = {p1, p2, p3, p4, p5};

        for (Person p : ps) {
            System.out.println("排序前：" + p);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        // mineSort(ps, sortOfAge);

       // SortUtils.sort(ps, sortOfAge);

     //   PersonSortAgeAndSalary pas = new PersonSortAgeAndSalary();
        SortUtils.sort(ps, new PersonSortAgeAndSalary());


        for (Person p : ps) {
            System.out.println("排序后：" + p);
        }

    }

    public static void mineSort(Person[] ps, PersonSortOfAge sortOfAge) {
        for (int i = 0; i < ps.length - 1; i++) {

            for (int j = 0; j < ps.length - i - 1; j++) {

                if (sortOfAge.compare(ps[j], ps[j + 1]) > 0) {
                    Person temp = ps[j];

                    ps[j] = ps[j + 1];
                    ps[j + 1] = temp;
                }
            }
        }


    }


}
