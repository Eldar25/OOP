package com.company;

import java.util.Scanner;

public class Analyzer {
    Scanner input = new Scanner(System.in);
    Data date = new Data();
    public void AddVal(){
        int i = 0;
        double averg = 0;
        while (true){
            int n = 0;
            System.out.println("Entered number (Q to quit):");
            String s = input.next();
            if(s.equals("Q")){
                break;
            }
            else{
                n = Integer.parseInt(s);
                i++;
                date.calc(n,i);
            }
        }
        System.out.println("Average = "+ date.getaverg());
        System.out.println("Max = "+ date.getmax());
    }
}
