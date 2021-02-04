package com.company;


public abstract class Animals {
    public Color color;
    public Animals(){}
    public Animals(Color color){
        if(color == Color.White){
            this.color = Color.White;
        }
        else{
            this.color = Color.Red;
        }
    }
    public abstract void voise()    ;

}
