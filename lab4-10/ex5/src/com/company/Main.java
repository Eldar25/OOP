package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        People p = new People();

        Scanner scan = new Scanner(System.in);
        while(true) {
            String word = scan.next();
            if(word.equals("person")) {
                p.Add(scan.next(), scan.next());
            }
            else if (word.equals("staff")) {
                p.Add(scan.next(), scan.next(), scan.next(), scan.nextDouble());
            }
            else if(word.equals("student")) {
                p.Add(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextDouble());
            }
            else if(word.equals("print")) {
                System.out.println(p);
            }
            else System.out.println("Error");
        }
	// write your code here
    }
}
