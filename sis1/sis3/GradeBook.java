import AAA.Student_Cl;

import java.util.*;

public class GradeBook {
	private int max, min;
	private double ave;
	private int[] arr = new int[11];
	public ArrayList<Student> st;
	private Student stmin;
	private Student stmax;
	
	public GradeBook() {
		st = new ArrayList<Student>();
		displayMessage();
		max = -1;
		min = 101;
		ave = 0;
	}
	public void addStudent(String name, int id) {
		st.add(new Student(name, id));
	}
	public void displayMessage() {
		System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!");
		System.out.println("\nPlease, input grades for students:" + "\n");
	}
	
	public void addGrade(int grade, Student student) {
		if(max<grade) {max = grade; stmax = student;}
		if(min>grade) {min = grade; stmin = student;}
		ave += grade;
		arr[grade/10] ++;
		
	}
	private double average() {
		return ave/st.size();
	}
	private int max() {
		return max;
	}
	private int min() {
		return min;
	}
	private String BarChart() {
		return "\nGrades distribution:\n"
				+ "00-09: " + new String(new char[arr[0]]).replace("\0", "*")+"\n"
				+ "10-19: " + new String(new char[arr[1]]).replace("\0", "*")+"\n"
				+ "20-29: " + new String(new char[arr[2]]).replace("\0", "*")+"\n"
				+ "30-39: " + new String(new char[arr[3]]).replace("\0", "*")+"\n"
				+ "40-49: " + new String(new char[arr[4]]).replace("\0", "*")+"\n"
				+ "50-59: " + new String(new char[arr[5]]).replace("\0", "*")+"\n"
				+ "60-69: " + new String(new char[arr[6]]).replace("\0", "*")+"\n"
				+ "70-79: " + new String(new char[arr[7]]).replace("\0", "*")+"\n"
				+ "80-89: " + new String(new char[arr[8]]).replace("\0", "*")+"\n"
				+ "90-99: " + new String(new char[arr[9]]).replace("\0", "*")+"\n"
				+ "100: " + new String(new char[arr[10]]).replace("\0", "*");
	}
	private String displayGradeReport() {
		return "Class average is " + average() + ". "
				+ "Lowest grade is " + min() + "(" + stmin + ". "
				+ "Highest grade is " + max() + stmax + "\n"
				+ BarChart();
	}
	public String toString() {
		return displayGradeReport();
	}
}
