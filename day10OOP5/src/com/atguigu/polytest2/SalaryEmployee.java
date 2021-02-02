package com.atguigu.polytest2;
class Manager extends SalaryEmployee{

    double comms;
    double commMoney;

    public Manager(String name, MyDate myDate, double salary, int workDays, int offdays, double comms, double commMoney) {
        super(name, myDate, salary, workDays, offdays);
        this.comms = comms;
        this.commMoney = commMoney;
    }

    public Manager() {
    }


    public Manager(String name, double salary, int workDays, int offdays, double comms, double commMoney) {
        super(name, salary, workDays, offdays);
        this.comms = comms;
        this.commMoney = commMoney;
    }

    @Override
    public double earning() {
        return (salary - salary/workDays*offdays)*(1+comms);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"，月薪是："+salary+"，工作日天数："+workDays+",请假天数"+offdays+"奖金比例"+comms;
    }
}
public class SalaryEmployee extends Employee {

    double salary;
    int workDays;
    int offdays;

    public SalaryEmployee(String name, MyDate myDate, double salary, int workDays, int offdays) {
        super(name, myDate);
        this.salary = salary;
        this.workDays = workDays;
        this.offdays = offdays;
    }

    public SalaryEmployee() {
    }

    public SalaryEmployee(String name, double salary, int workDays, int offdays) {
        super(name);
        this.salary = salary;
        this.workDays = workDays;
        this.offdays = offdays;
    }

    @Override
    public double earning() {
        return salary-salary/workDays*offdays;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"月薪是："+salary+"工作日天数："+workDays+"请假天数是："+offdays;
    }


}
