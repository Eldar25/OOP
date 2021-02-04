package com.company;

import java.util.Vector;

public class Manager extends Employee{
    private Vector<Employee> employees = new Vector<Employee>();
    private double bonus;
    public Manager(double bonus,String name, double value, int year,String insuranceNumber){
        super (name,value,year,insuranceNumber);
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }

}
