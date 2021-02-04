package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.err.println("(^.^)");
        Scanner sc = new Scanner(System.in);
        Color white = Color.White;
        Color red = Color.Red;
        Cat cat_white = new Cat(white);
        Cat cat_red = new Cat(red);
        System.out.println("what color do you want a cat?");
        String s = sc.next();
        if(s.equals("white")){
            cat_white.move(5);
        }
        else{
            cat_red.move(5,2);
        }
    }
}
