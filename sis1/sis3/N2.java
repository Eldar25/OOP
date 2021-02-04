import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeBook grb = new GradeBook();
		Course course = new Course("OOP", "predmet",3);
		Scanner scan = new Scanner(System.in);
		grb.addStudent("A", 1);
		grb.addStudent("B", 2);
		grb.addStudent("C", 3);
		grb.addStudent("D", 4);
		grb.addStudent("E", 5);
		grb.addStudent("F", 6);
		for(int i=0; i<grb.st.size();i++) {
			System.out.print("Student " + grb.st.get(i).getName() + ": ");
			grb.addGrade(scan.nextInt(), grb.st.get(i));
			System.out.print("\n");
		}
		System.out.println(grb);
	}

}
