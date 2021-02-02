package com.atguigu.service;

import com.atguigu.bean.Customer;
import com.atguigu.dao.daoimpl.CustomerDaoImpl;

import java.util.List;

//等价于CustomerList
public class CustomerService {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();

    //定义数组 存储添加的客户
    // Customer[] arr = new Customer[10];

    Customer[] arr;

    public CustomerService() {
    }

    public CustomerService(int length) {
        arr = new Customer[length];
    }

    //定义变量 记录 数组内元素的数量
    int count;


    /**
     * 添加客户
     *
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {

        int i = customerDao.insertCustomer(customer);
        return i > 0;
    }

    /**
     * 根据编号查询 用户
     *
     * @param id
     * @return
     */
    public Customer getCustomerById(int id) {
        //对编号进行校验
        Customer customer = customerDao.findById(id);

        return customer;
    }

    /**
     * 更新指定编号的客户
     *
     * @param id
     * @return
     */
    public boolean replaceCustomer(int id, Customer customer) {
        //將修改後的 對象 返回給數組的原位置
        int i = customerDao.updateCustomer(id, customer);
        return i > 0;
    }

    public boolean deleteCustomerById(int id) {

        int i = customerDao.deleteById(id);


        return i>0;
    }

    public List<Customer> getAllCustomers() {

        List<Customer> all = customerDao.getAll();

        return all;
    }

}
