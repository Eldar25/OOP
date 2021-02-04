package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a =in.nextInt();
        float b = in.nextInt();
        float r = ((b * a)/100 ) + a ;
        System.out.println(r);
	// write your code here
    }
}
