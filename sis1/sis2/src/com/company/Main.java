package com.company;

import com.company.java.com.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GradeBook gb = new GradeBook();
        Course course = new Course("OOP", "predmet",3);
        Scanner scan = new Scanner(System.in);
        gb.addStudent("A", 1);
        gb.addStudent("B", 2);
        gb.addStudent("C", 3);
        gb.addStudent("D", 4);
        gb.addStudent("E", 5);
        gb.addStudent("F", 6);
        for(int i=0; i<gb.st.size();i++) {
            System.out.print("Student " + gb.st.get(i).getName() + ": ");
            gb.addGrade(scan.nextInt(), gb.st.get(i));
            System.out.print("\n");
        }
        System.out.println(gb);
    }
}
