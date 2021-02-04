package com.company;

public class Temp {
    public double temp ;
    public  char sign ;
    public Temp(double temp , char sign){
        this.temp  = temp;
        this.sign = sign;
    }
    public Temp(){
        this.temp = 0;
        this.sign = 'C';
    }
    public Temp(double temp){
        this.temp = temp;
        this.sign = 'C';
    }
    public Temp(char sign){
        this.sign = sign;
        this.temp = 0;
    }
    double degrC(){
        if(sign == 'F'){
            double c = 5 * (temp - 32) / 9;
            return c;
        }else {
            return degrF();
        }
    }
    double degrF(){
         if(sign == 'F') {
            return degrC();
        }
        else{
             double f = (9 * (temp / 5)) + 32;
             return f;
        }
    }
    void setv(){
        this.temp = temp;
    }
    void setf(){
        this.sign = sign;
    }
    void setboh(){
        this.sign = sign;
        this.temp = temp;
    }
    char returnscale(){
        if(sign == 'F'){
            return 'C';
        }
        else{
            return 'F';
        }
    }
}
