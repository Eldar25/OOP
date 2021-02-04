package com.company;

public class Circle extends Shape {
    public Circle (Color color) {
        super(color);
    }
    @Override
    public void draw(){
        if(color == Color.Black){
            System.out.println("O");
        }else{
            System.err.println("O");
        }
    }
}
