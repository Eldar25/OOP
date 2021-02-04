package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        int c = sr.nextInt();
        double d =(b*b )- (4*a*c);
        double dd = Math.sqrt(d);
        if(dd<0){
            System.out.println("error");
        }else {
            double x1 = ((-b) + dd) / 2 * a;
            double x2 = (-b - dd) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
            // write your code here
        }
    }
}
