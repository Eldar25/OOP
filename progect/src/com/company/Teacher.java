package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Teacher extends Employee {
    private String name;
    private String subject;
    private Vector courses = new Vector();

    public void addCourse (String dname){
        Scanner in = new Scanner(System.in);
        System.out.println("Write name of Course");
        String nameofCourse = in.next();
        subject = nameofCourse;
        System.out.println("Creadit:");
        int creadit = in.nextInt();
        this.name = name;
        Course course = new Course(name,subject,creadit);
        File file = new File("C:\\OOP\\progect\\src\\com\\company\\Courses\\" +nameofCourse+ ".txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(course.toString()+ " " + ";");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        courses.addElement(course);
       // System.out.println(courses.size());
        // System.out.println(courses.toString());

    }
    public String viewCourse(){
        return "";
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
    public void putMarks()throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        System.out.println("Write name of Student:");
        String loginofstudent = in.next();
        String nmf = loginofstudent+".txt";

        File folder = new File("C:\\OOP\\progect\\src\\com\\company\\StudentsCourse");
        for (File file : folder.listFiles())
        {
            if(nmf.equals(file.getName())){
                File file1 = new File(folder+"\\"+nmf);
                Scanner sc = new Scanner(file);
                String line = sc.nextLine();
                System.out.println(line);
                System.out.println("Write name of Student then course, creadits,marks");
                String n = in.next();
                String ns = in.next();
                String c = in.next();
                int p = in.nextInt();
                try {
                    FileWriter writer = new FileWriter(file1);
                    writer.write(n+" " + ns+" " + c+" " + p);
                    writer.close();
                }catch (IOException e){
                    e.printStackTrace();
                }


            }

            //System.out.println(file.getName());
        }
    }
    public void sendOrder(){
        System.out.println("Write your order");
        Scanner in = new Scanner(System.in);
        String order = in.next();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return name.equals(teacher.name) &&
                subject.equals(teacher.subject) &&
                courses.equals(teacher.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subject, courses);
    }

    public void addCoursesFile(){

    }
}
