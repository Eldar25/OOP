package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String pieace_name = sc.next();
            if(pieace_name.equals("show")){
                System.out.println(Board.cnt);
                Board.show();
            }
            else if(pieace_name.equals("stop")){
                System.out.println("end");
                break;
            }else {
                String p1 = sc.next();
                String p2 = sc.next();
                if (pieace_name.equals("rock")) {
                    Rock rock = new Rock(p1,p2);
                    System.out.println(Board.cnt);
                } else if (pieace_name.equals("king")) {
                    King king =new King(p1, p2);
                    Board.test();
                }
            }


        }
	// write your code here
    }
}
