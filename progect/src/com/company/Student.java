package com.company;

import java.util.*;

public class Student extends User {
    private String yearofstudy;
    private String faculty;
    private String specialty;
    private String id;
    private String name;
    private String surname;
    private Vector<Course> courses;

    public Student(){}

    public Student(String name ,String surname , String id , String faculty, String specialty, String yearofstudy){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.faculty = faculty;
        this.specialty = specialty;
        this.yearofstudy = yearofstudy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return yearofstudy.equals(student.yearofstudy) &&
                faculty.equals(student.faculty) &&
                specialty.equals(student.specialty) &&
                id.equals(student.id) &&
                name.equals(student.name) &&
                surname.equals(student.surname) &&
                courses.equals(student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearofstudy, faculty, specialty, id, name, surname, courses);
    }

    public void registerForCourse(){
    }
    public String viewTranscript(){
        return "";
    }
    public String viewCourse(){
        return "";
    }
    public String viewFilesOfCourse(){
        return "";
    }
    public String viewMarksOfCourse(){
        return"";
    }
    public String viewInfoAboutTeacher(){
        return"";
    }
    public String getTranscript(){return "";}
}
