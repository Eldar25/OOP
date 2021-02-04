package com.company.java.com;


public class Student {
    private String name;
    private int id;
    private int year = 2;

    //int a;
    public Student(String name, int  id){
        Name(name);
        Id(id);

    }
    public void Name(String name) {
        this.name = name;
    }
    public void Id(int id) {
        this.id = id;
    }
    public void Year() {
        year++;
    }
    void  setYear(){
        this.year = year;
    }

    public String getName() { return this.name; }

    public int getId() {
        return id;
    }

    public int getYear() { return year; }
    public String toString() {
        return "(Student " + name + ", id: " + id + ")";
    }
}
