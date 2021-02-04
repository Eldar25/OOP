package com.company.java.com;


public class Student {
    private String name;
    private int id;
    private int year;
    //int a;
    public String getName(){
        return this.name;
    }
    Student( String name, int id ,int year){
        this.name = name;
        this.id = id;
        this.year = year;
        //this.a =a;
    }

    void next_year(){
        year++;
        System.out.println(name + " " + id + " " + year);
    }

}
