package com.company;

public class Triangle extends Shape {
    public Triangle(Color color){
        super(color);
    }
    @Override
    public void draw(){
        if(color == Color.Black){
            System.out.println("/|");
        }else{
            System.err.println("/|");
        }
    }
}
