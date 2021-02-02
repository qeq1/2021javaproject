package com.atguigu.dao.daoimpl;

import com.atguigu.bean.Customer;
import com.atguigu.dao.BaseDao;
import com.atguigu.dao.CustomerDao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CustomerDaoImpl extends BaseDao implements CustomerDao {
    @Override
    public int insertCustomer(Customer customer) {
        String sql = "insert into customer values(null,?,?,?,?,?)";

        try {
            int update = update(sql, customer.getName(), customer.getPhone(), customer.getEmail(), customer.getAge(), customer.getGender());
            return update;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteById(int id) {
        String sql = "delete from customer where id  = ?";
        try {
            int update = update(sql, id);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public Customer findById(int id) {

        String sql  ="select * from customer where id  = ?";
        try {
            Customer one = getOne(Customer.class, sql, id);
            return one;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Customer> getAll() {

        String sql = "select * from customer";
        try {
            List<Customer> all = getAll(Customer.class, sql, null);
            return all;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateCustomer(int id,Customer customer) {

        String sql= "update customer set name = ?,phone = ?,email = ?,age = ?,gender = ? where id  = ?";

        try {
           return  update(sql, customer.getName(),customer.getPhone(),customer.getEmail(),customer.getAge(),customer.getGender(),id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
