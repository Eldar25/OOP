package com.company;

public class Student extends Person{
    private  String program;
    private  int year;
    private double fee;

    public Student(String program , int year , double fee){
        this.program = program;
        this.year = year;
        this.fee =fee;
    }
    public Student(){}
    public String getProgram(){
        return program;
    }
    public void  setProgram(String newProgram){
        this.program = newProgram;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
    public double getFee(){
        return fee;
    }
    public  void setFee(double newFee){
        this.fee = newFee;
    }
    @Override
    public String toString(){
        return "name = " + getName() + " address = " + getAddress()  + " program = " + program + " year = " + year + " fee = " + fee;
    }
}
