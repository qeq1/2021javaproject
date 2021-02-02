package com.atguigu.dao;

import com.atguigu.bean.Customer;

import java.util.List;

public interface CustomerDao {


     //新增一条数据
   int insertCustomer(Customer customer);
   //删除一条数据
    int deleteById(int id);
    //根据id查询客户
    Customer findById(int id);
    //查询所有的客户
    List<Customer> getAll();
    int updateCustomer(int id,Customer customer);

}
