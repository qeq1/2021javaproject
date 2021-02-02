package com.atguigu.comparable1;

import com.atguigu.utils.SortUtils;

public class TestArray2 {
    public static void main(String[] args) {

        Student s1 = new Student("蔡旭坤", 18, 99);
        Student s2 = new Student("赵四", 20, 99.2);
        Student s3 = new Student("刘能", 15, 99.3);
        Student s4 = new Student("谢广坤", 15, 99.6);
        Student s5 = new Student("谢大脚", 32, 99.7);
        //添加到数组内
        Student ts[] = {s1, s2, s3, s4, s5};
        SortUtils.sort(ts);
        for (Student t : ts) {
            System.out.println("排序前："+t);
        }
        //TestArray.mineSort(ts);
        System.out.println("\n--------------------------------------------------\n");
        SortUtils.sort(ts);
        for (Student t : ts) {
            System.out.println("排序后："+t);
        }

    }
}
