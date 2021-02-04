package com.company;

public class Univer{
    enum level{HARD,NORMAL,EASY};
    public String name;
    public int id;
    public double gpa;
    public int yos ;
    public Univer(String name, int id, double gpa, int yos){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.yos = yos;
    }
    public void print(double gpa2 , int cred1){
        gpa = gpa+ gpa2/cred1;
        System.out.println(gpa);
    }
    public void print(double gpa1,int cred1 , double gpa2,int cred2){
        level easy = level.EASY;
        gpa = gpa + gpa1/cred1 + gpa2/cred2;
        System.out.println(gpa);
        System.out.println( " "+ easy);
    }

}
