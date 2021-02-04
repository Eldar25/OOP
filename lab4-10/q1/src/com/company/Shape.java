package com.company;


 public abstract class Shape {

     public Color color;
     public Shape(Color color){
         if(color == Color.Black){
             this.color = Color.Black;
         }
         else{
             this.color = Color.Red;
         }
     }
     public abstract void draw()    ;

}