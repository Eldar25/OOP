package com.company;

public class Course {
    private String name;
    private String nameofcourse;
    private  int creadits;
    private String nameofstudent;

    public Course(){}

    public Course(String name , String nameofcourse , int creadits){
        this.name = name;
        this.nameofcourse = nameofcourse;
        this.creadits =creadits;
    }
    public Course(String name , String nameofcourse , int creadits,String nameofstudent){
        this.name = name;
        this.nameofcourse = nameofcourse;
        this.creadits =creadits;
        this.nameofstudent = nameofstudent;
    }

    public String getNameofstudent() {
        return nameofstudent;
    }

    public void setNameofstudent(String nameofstudent) {
        this.nameofstudent = nameofstudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameofcourse() {
        return nameofcourse;
    }

    public void setNameofcourse(String nameofcourse) {
        this.nameofcourse = nameofcourse;
    }

    public int getCreadits() {
        return creadits;
    }

    public void setCreadits(int creadits) {
        this.creadits = creadits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", nameofcourse='" + nameofcourse + '\'' +
                ", creadits=" + creadits +
                ", nameofstudent='" + nameofstudent + '\'' +
                '}';
    }
}
