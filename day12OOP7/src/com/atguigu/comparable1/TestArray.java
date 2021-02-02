package com.atguigu.comparable1;

import com.atguigu.utils.SortUtils;

public class TestArray {
    public static void main(String[] args) {

        Person p1 = new Person("李白", 20);
        Person p2 = new Person("杜甫", 19);
        Person p3 = new Person("李商隐", 18);
        Person p4 = new Person("辛弃疾", 17);
        Person p5 = new Person("白居易", 16);
        //将数据添加到数组内
        Person[] ps = {p1,p2,p3,p4,p5};

        for (Person p : ps) {
            System.out.println("排序前："+p);
        }
      //  mineSort(ps);

        SortUtils.sort(ps);
        System.out.println("-------------------------------------------------------");
        for (Person p : ps) {
            System.out.println("排序后："+p);
        }
    }

    public static void mineSort(Person[] ps) {

        for(int i = 0;i<ps.length-1;i++){

            for(int j = 0;j<ps.length-1;j++){
                //当前一个数大于后一个数交换俩数的位置

                if(ps[j].compareTo(ps[j+1])>0){
                //交换俩数的位置
                    Person temp = ps[j];

                    ps[j] = ps[j+1];
                    ps[j+1] = temp;
                }

            }
        }
    }
}
