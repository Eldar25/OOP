package com.company;

public class Main {

    public static void main(String[] args) {
        Time t = new Time(23,5,6);
        Time t2 = new Time(4,24,33);
        System.out.println(t.toStandard());
        System.out.println(t.toUniversal());
	// write your code here
    }
}
