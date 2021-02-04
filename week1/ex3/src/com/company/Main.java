package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        double a = sr.nextDouble();
        if(a> 50){
            if(a >= 50 && a < 55){
                System.out.println("Your GPA equals to 1 and your letter is D");
            }
            else if(a>=55 && a < 60){
                System.out.println("Your GPA equals to 1.33 and your letter is D+");
            }
            else if (a>=60 && a< 65){
                System.out.println("Your GPA equals to 1.67 and your letter is C-");
            }
            else if(a >= 65 && a < 70){
                System.out.println("Your GPA equals to 2 and your letter is C");
            }
            else if(a >= 70 && a < 75){
                System.out.println("Your GPA equals to 2.33 and your letter is C+");
            }
            else if(a >= 75 && a < 80){
                System.out.println("Your GPA equals to 2.67 and your letter is B-");
            }
            else if(a >= 80 && a < 85){
                System.out.println("Your GPA equals to 3 and your letter is B");
            }
            else if(a >= 85 && a < 90){
                System.out.println("Your GPA equals to 3.33 and your letter is B+");
            }
            else if(a >= 90 && a < 95){
                System.out.println("Your GPA equals to 3.67 and your letter is A-");
            }
            else if(a >= 95 && a < 100){
                System.out.println("Your GPA equals to 4 and your letter is A");
            }
        }
        else{
            System.out.println("sorry, i guess you have retake");
        }
	// write your code here
    }
}
