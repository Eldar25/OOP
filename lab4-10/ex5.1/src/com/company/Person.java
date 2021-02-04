package com.company;

import java.util.Vector;

public class Person {
    private String name;
    private String address;
    public Person(String name , String address){
        this.name = name;
        this.address = address;
    }
    public Person(){}
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newaddress){
        this.address = newaddress;
    }
    public String toString(){
        return "name = " + name + " address = " + address;
    }
}
