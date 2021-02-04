package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Integer a = sr.nextInt();
        int area = a * a;
        int per = a*4;
        double dg = a * Math.sqrt(a);
        System.out.println("area = "+ area);
        System.out.println("perimeter = " + per);
        System.out.println("diagonal = " + dg);
    }
}
