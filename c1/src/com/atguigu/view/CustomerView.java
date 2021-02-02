package com.atguigu.view;

import com.atguigu.bean.Customer;
import com.atguigu.service.CustomerService;
import com.atguigu.utils.CMUtility;

import java.util.List;

public class CustomerView {
    //add update()。。。 customerService
    static CustomerService customerService = new CustomerService(5);

    public static void show() {

        while (true) {
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println("1 添 加 客 户");
            System.out.println("2 修 改 客 户");
            System.out.println("3 删 除 客 户");
            System.out.println("4 客 户 列 表");
            System.out.println("5 退           出");
            System.out.print(" 请选择(1-5)：_");
            //Scanner
            char c = CMUtility.readMenuSelection();

            switch (c) {
                case '1':
                    add();
                    break;
                case '2':
                    update();
                    break;
                case '3':
                    delete();
                    break;
                case '4':
                    list();
                    break;
                case '5':

                    System.out.println("您是真的退出吗？");
                    char c1 = CMUtility.readConfirmSelection();
                    if (c1 == 'Y') {
                        System.out.println("欢迎您下次光临");
                        return;
                    }
                    break;

            }


        }


    }

    /**
     * 客户列表
     */
    private static void list() {
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
       List<Customer> customers = customerService.getAllCustomers();

       customers.forEach(System.out::println);

        System.out.println(" -------------------------客户列表完成-------------------------");
    }
    /**
     * 删除用户
     */
    private static void delete() {
        System.out.println("---------------------删除客户---------------------");
        System.out.println(" 请选择待删除客户编号(-1退出)：");
        //-1退出
        int id = CMUtility.readInt();
        if (id == -1) {
            return;
        }
        Customer customer = customerService.getCustomerById(id);
        if (customer != null) {
            System.out.println(" 确认是否删除(Y/N)：y");

            char c = CMUtility.readConfirmSelection();
            if (c == 'Y') {
                boolean b = customerService.deleteCustomerById(id);
                System.out.println(b ? "删除成功" : "删除失败");
            }
        } else {
            System.out.println("查无此人");
        }


        System.out.println("  ---------------------删除完成---------------------");


    }

    /**
     * 修改用户
     */
    private static void update() {
        System.out.println("---------------------修改客户---------------------");
        System.out.println(" 请选择待修改客户编号(-1退出)：");
        int id = CMUtility.readInt();
        //-1退出
        if (id == -1) {
            return;
        }
        Customer oldCustomer = customerService.getCustomerById(id);

        if (oldCustomer != null) {
            System.out.println("  姓名(" + oldCustomer.getName() + ")：<直接回车表示不修改>");
            String name = CMUtility.readString(20, oldCustomer.getName());
            System.out.println(" 性别(" + oldCustomer.getGender() + ")：");
            String gender = CMUtility.readString(20, oldCustomer.getGender());
            System.out.println(" 年龄(" + oldCustomer.getAge() + ")：");
            int age = CMUtility.readInt(oldCustomer.getAge());
            System.out.println(" 电话(" + oldCustomer.getPhone() + ")：");
            String phone = CMUtility.readString(20, oldCustomer.getPhone());
            System.out.println("  邮箱(" + oldCustomer.getEmail() + ")：");
            String email = CMUtility.readString(20, oldCustomer.getEmail());
            Customer customer = new Customer(name, gender, age, phone, email);
            boolean b = customerService.replaceCustomer(id, customer);

            System.out.println(b ? "修改成功" : "修改失败");


        } else {
            System.out.println("查无此人");
        }


        System.out.println(" ---------------------修改完成---------------------");


    }

    /**
     * 添加用户的方法
     */
    private static void add() {
        System.out.println(" ---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(20);
        System.out.print(" 性别:");
        String gender = CMUtility.readString(20);
        System.out.print(" 年龄：");
        int age = CMUtility.readInt();
        System.out.println(" 电话：");
        String phone = CMUtility.readString(20);
        System.out.println(" 邮箱：");
        String email = CMUtility.readString(20);
        //将数据封装为对象
        Customer customer = new Customer(name, gender, age, phone, email);
        //创建业务层对象


        boolean b = customerService.addCustomer(customer);

        System.out.println(b ? "添加成功" : "添加失败");


        System.out.println("  ---------------------添加完成---------------------");


    }
}
