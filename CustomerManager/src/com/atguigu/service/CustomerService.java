package com.atguigu.service;

import com.atguigu.bean.Customer;

//等价于CustomerList
public class CustomerService {


    //定义数组 存储添加的客户
   // Customer[] arr = new Customer[10];

    Customer[] arr;

    public CustomerService(int length) {
        arr = new Customer[length];
    }
//定义变量 记录 数组内元素的数量
    int count ;


    /**
     * 添加客户
     *
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {

        //数组已满 不能添加

        if(count>=arr.length){
            System.out.println("数组已满 无法添加");
            return false;
        }

        //数组没有满直接添加
        arr[count++] = customer;
  /*      arr[count] = customer;
        //添加完毕 更改count的数量

        count++;*/


        return true;
    }

    /**
     * 根据编号查询 用户
     * @param id
     * @return
     */
    public Customer getCustomerById(int id) {
        //对编号进行校验
        if(id<=0 || id >count){
            return null;
        }
    //數組實際存儲的位置是编号-1
        return arr[id-1];
    }
    /**
     * 更新指定编号的客户
     *
     * @param id
     * @return
     */
    public boolean replaceCustomer(int id, Customer customer) {
        //將修改後的 對象 返回給數組的原位置
        arr[id-1] = customer;
        return true;
    }

    public boolean deleteCustomerById(int id){

        //完成替换
        System.arraycopy(arr,id, arr, id-1, count-id);

        //将最后一个元素放空

        //arr[count-1] = null;
        arr[--count] = null;

        return true;
    }

    public Customer[] getAllCustomers(){
        //有几个有效客户
        Customer newArr[] = new Customer[count];
        //遍历 将 有效元素复制到新数组内

        for(int i = 0;i<count;i++){

            newArr[i] = arr[i];
        }

        return newArr;
    }

}
