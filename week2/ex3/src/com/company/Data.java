package com.company;

public class Data {
    private double max = - 1000;
    private double a = 0;
    private  int n;
    public Data(){
    }
   public void calc(int k, int v){
        int time = v;
        if(k>max){
            max = k;
        }

        n+=k;
        a=n/v;

    }
    public double getmax(){
        return max;
    }
    public double getaverg(){
        return a;
    }
}
