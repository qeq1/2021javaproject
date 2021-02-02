package com.atguigu.polytest2;
//小时工
public class HourEmployee extends Employee {

    int workHours;
    double hourPrice;


    public HourEmployee() {
    }

    public HourEmployee(String name, MyDate myDate, int workHours, double hourPrice) {
        super(name, myDate);
        this.workHours = workHours;
        this.hourPrice = hourPrice;
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

    @Override
    public String getInfo() {
        return super.getInfo()+"时薪是："+hourPrice+",工作了"+workHours+"个小时";
    }

    public void leave(){
        System.out.println("离开了");
    }

}
