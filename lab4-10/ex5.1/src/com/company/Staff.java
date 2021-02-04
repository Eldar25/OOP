package com.company;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String school , double pay){
        this.school = school;
        this.pay = pay;
    }
    public Staff(){}

    public String getSchool(){
        return school;
    }
    public void setSchool(String newschool){
        this.school = newschool;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double newPay){
        this.pay = newPay;
    }

    public String toString(){
        return "name = " + getName() + " address = " + getAddress() + " school = " + school + " pay = " + pay;
    }
}
