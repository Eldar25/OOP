package com.company;

public class Maht {
    static {
        System.out.println("Static init block  ");
    }//при первом обращении

    {
        System.out.println("Init block");
    }//при создани экз
    public static int summ(int a, int b){
        return a + b;
    }
    public int mult(int a, int b){
        return  a*b;
    }
}
