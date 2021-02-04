package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        int width = jin.nextInt();
        StarTriangl small = new StarTriangl(width);
        System.out.println(small.toString());
	// write your code here
    }
}
