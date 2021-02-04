package com.company;

import java.io.*;
import java.util.*;

public class Manager extends Employee{

    private String name;

    public Manager(){}

    public  Manager(String name){
        this.name = name;
    }
    public String viewStudentInfo()throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Write name of Student");
        String nameofstudent = in.next();
        File fileStudent = new File("C:\\OOP\\progect\\src\\com\\company\\Students\\"+nameofstudent+".txt");
        Scanner sc = new Scanner(fileStudent);
        String line = sc.nextLine();
        sc.close();

        return line;
    }
    public String viewTeacherInfo()throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Write name of Teacher");
        String nameofteacher = in.next();
        File fileTeacher = new File("C:\\OOP\\progect\\src\\com\\company\\Teachers\\"+nameofteacher+".txt");
        Scanner sc = new Scanner(fileTeacher);
        String line = sc.nextLine();
        sc.close();

        return line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return name.equals(manager.name);
    }

    @Override
    public int hashCode() {
        int result = 1;
         result = 31 * result + name.hashCode();
        return result;
    }
}
