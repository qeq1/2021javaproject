package com.atguigu.polytest;

public class HourEmployee extends Employee {

    private int workHours;//工作小时数

    private double hourPrice;// 一小时多少钱

    public HourEmployee() {
    }

    public HourEmployee(String name, int workHours, double hourPrice) {
        super(name);
        this.workHours = workHours;
        this.hourPrice = hourPrice;
    }

    @Override
    public double earning() {
        return workHours * hourPrice;
    }


}
