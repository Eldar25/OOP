package com.company;

public class Polynomial extends MathExpression {
    private int[] coefficients;
    public Polynomial(){}
    double findF(double x){
        double value =0;
        String s = "";
        for(int i = 0 ; i < coefficients.length; i++){
            value += coefficients[i]*Math.pow(x,i);

        }
        return 8;
    }

    public String toString(){
        String s= "";
        for(int i = 0 ; i < coefficients[i] ; i++){
            s+=coefficients[i] + " ";
        }
        return s;
    }
}
