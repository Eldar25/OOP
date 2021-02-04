package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Person,Staff> personStaffHashMap = new HashMap<Person,Staff>();
        HashMap<Person,Student> personStudentHashMap = new HashMap<Person,Student>();
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("staff or student");
            String word = scan.next();
            String name = scan.next();
            String adress = scan.next();
            Person p = new Person(name, adress);

            if (word.equals("staff")) {
                 String school = scan.next();
                 double pay = scan.nextDouble();
                 Staff s = new Staff(school, pay);
                personStaffHashMap.put(p,s);
            }
            else if(word.equals("student")) {
                String program = scan.next();
                int year = scan.nextInt();
                double fee = scan.nextDouble();
                Student student = new Student(program,year,fee);
                personStudentHashMap.put(p,student);
            }
            else if(word.equals("print")) {
                if(!personStaffHashMap.isEmpty() && personStudentHashMap.isEmpty()){
                    System.out.println(personStaffHashMap);
                }else if(!personStudentHashMap.isEmpty() && personStaffHashMap.isEmpty()){
                    System.out.println(personStudentHashMap);
                }else if(personStaffHashMap.isEmpty() && personStudentHashMap.isEmpty()){
                    System.out.println("NULL");
                }
                else{
                    System.out.println(personStaffHashMap);
                    System.out.println(personStudentHashMap);
                }
            }
            else {
                System.out.println("Error");
                break;
            }
        }
	// write your code here
    }
}
