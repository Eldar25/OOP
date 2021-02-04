package com.company;

public class Square extends Shape {
    private int sp = 0;
    public Square(Color color, int n){
        super(color);
        this.sp = n;
    }
    @Override
    public void draw(){
        for(int i = 0 ; i < sp ;i++) {
            System.out.print(" ");

        }
            if (color == Color.Black) {

                System.out.println("|_|");
            } else {
                System.err.println("|_|");
            }

    }
}
