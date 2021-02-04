package com.company;
import java.util.*;
import  java.io.*;

public class Admin extends Employee{
    private Vector students = new Vector();
    public Admin(){}


    public void addUser(String newlogin , String newpassword)throws FileNotFoundException,IOException,ClassNotFoundException,NullPointerException{
        Scanner in = new Scanner(System.in);

        File file = new File("C:\\OOP\\progect\\src\\com\\company\\StudentsLog\\"+newlogin+".txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(newlogin + " " + newpassword + " " + ";");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(students, admin.students);
    }



    public void addUserStudent(Student student){
        students.addElement(student);
    }
    public void removeUser(Vector names, Vector Logs)throws IOException ,ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Write name:");
        String dname = in.next();
        if (!names.contains(dname)) {
            System.out.println("Not found name");
        } else {
            System.out.println("Write login:");
            String dlogin = in.next();
            File file = new File("C:\\OOP\\progect\\src\\com\\company\\StudentsLog\\" + dlogin + ".txt");
            File fileStudent = new File("C:\\OOP\\progect\\src\\com\\company\\Students\\" + dname + ".txt");

            if (names.contains(dname) && Logs.contains(dlogin)) {
                names.remove(dname);
                Logs.remove(dlogin);
                if (file.delete()) {
                    System.out.println("File успешно удалён!");
                } else {
                    System.out.println("Файл  не существует.");
                }
                if (fileStudent.delete()) {
                    System.out.println("FileStudent успешно удалён!");
                } else {
                    System.out.println("ФайлStudent  не существует.");
                }
            }

        }
    }

    public  void  seeLog(Vector Logs){
        System.out.println(Logs.toString());
    }
}

