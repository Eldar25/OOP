package com.company;

public class Employee extends Person {
    private double value;
    private int year;
    private String insuranceNumber;

    public Employee(){}
    public Employee(String name, double value, int year,String insuranceNumber){
        super(name);
        this.value = value;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }
    @Override
    public String toString(){
        return "Name = "+ name + "Vale = " + value + "Year = " + year + "insuranceNumber = " + insuranceNumber;
    }
    @Override
    public boolean equals(){
        return true;
    }
}
