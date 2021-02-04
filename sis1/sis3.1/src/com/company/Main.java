package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        DragonLaunch dl = new DragonLaunch();

        while (true) {
            Person p;
            String s = sc.nextLine();
            if (s.equals("B")) {
                p = new Person(Gender.BOY);
                dl.kidnap(p);
            }
            if (s.equals("G")) {
                p = new Person(Gender.GIRL);
                dl.kidnap(p);
            }
            if (s.equals("Q"))
                break;
        }
        if (dl.willDragonEatOrNot())
            System.out.println("will eat");
        else
            System.out.println("won't eat");
    }

}



