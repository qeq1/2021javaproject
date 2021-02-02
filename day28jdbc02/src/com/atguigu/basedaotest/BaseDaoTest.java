package com.atguigu.basedaotest;

import com.atguigu.basedao.BaseDao;
import com.atguigu.bean.Account;
import com.atguigu.bean.Users;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BaseDaoTest {
    BaseDao baseDao = new BaseDao();

    @Test
    public void test01() throws IllegalAccessException, NoSuchFieldException, IOException, InstantiationException, SQLException, ClassNotFoundException {


        String sql = "select id,sname name,balance from account where id < ? and balance > ?";

        Object[] arr = {4, 100};

        List<Account> all = baseDao.getAll(Account.class, sql, arr);

        all.forEach(System.out::println);

    }

    @Test
    public void test02() throws IllegalAccessException, NoSuchFieldException, IOException, InstantiationException, SQLException, ClassNotFoundException {

        String sql = "select * from users";

        List<Users> all = baseDao.getAll(Users.class, sql, null);

        all.forEach(System.out::println);
    }

    @Test
    public void test03() throws IllegalAccessException, NoSuchFieldException, IOException, InstantiationException, SQLException, ClassNotFoundException {

        String sql = "select * from users where id =?";

        Users one = baseDao.getOne(Users.class, sql, 1);
        System.out.println(one);
    }

    @Test
    public void test04() throws Exception{

        String sql = "select did,max(salary) 最高薪水 ,round(avg(salary),2) 平均薪水 from t_employee   group by did";

        List<Map<String, Object>> list = baseDao.mapToList(sql, null);

        Set<String> keys = list.get(0).keySet();


        Object[] array = keys.toArray();
        //格式化输出
        System.out.printf("%-10s%-15s%-15s\n",array[0],array[1],array[2]);

        for (Map<String, Object> map : list) {
            Collection<Object> values = map.values();
            Object[] objects = values.toArray();
            System.out.printf("%-15s%-15s%-15s\n",objects[0],objects[1],objects[2]);
        }
        //System.out.println(list.size());
        System.out.println(list);
    }

    @Test
    public void test05() throws SQLException, IOException, ClassNotFoundException {
        String sql = "select count(*) from account";
        Object singleValue = baseDao.getSingleValue(sql, null);
        System.out.println(singleValue);
    }
}