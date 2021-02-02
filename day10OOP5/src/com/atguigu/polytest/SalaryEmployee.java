package com.atguigu.polytest;

class Manager extends SalaryEmployee{
    @Override
    public double earning() {
        return (getSalary()-getSalary()/getWorkday()*getOffday())*(1+comms);
    }
    //奖金比例
    private double comms;


    public Manager() {
    }

    public Manager(double salary, int workday, int offday, String name, double comms) {
        super(salary, workday, offday, name);
        this.comms = comms;
    }
}

public class SalaryEmployee extends Employee {
    private double salary;
    private int workday;//工作日天数
    private int offday;//请假天数

    public SalaryEmployee() {
    }

    public SalaryEmployee(double salary, int workday, int offday,String name) {
        super(name);
        this.salary = salary;
        this.workday = workday;
        this.offday = offday;
    }

    @Override
    public double earning() {
        return salary-salary/workday*offday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public int getOffday() {
        return offday;
    }

    public void setOffday(int offday) {
        this.offday = offday;
    }
}
