package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner im  = new Scanner(System.in);
        String name = im.next();
        int id = im.nextInt();
        int year = im.nextInt();
        Student Eldar = new Student(name, id , year);
        Eldar.next_year();
    }
}
