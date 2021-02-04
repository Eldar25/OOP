package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String name = num.next();
        PrintMyName pr = new PrintMyName(name);
        System.out.println(pr.name);
        draw(name.length(), pr.name);
    }

    private static void draw(int n, String name) {
        int k = n + 2;
        int t = 0;
        char[] ch = name.toCharArray();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < k; j++) {
                if (i == 0 && j == 0) {
                    System.out.print('+');
                } else if (j == k - 1 && i == 0) {
                    System.out.print('+');
                } else if (j == 0 && i == 2) {
                    System.out.print('+');
                } else if (j == k - 1 && i == 2) {
                    System.out.print('+');
                } else if (t == 0 && i == 1 && j != 0 && j != k - 1) {
                    for (int l = 0; l < name.length(); l++) {
                        j++;
                        System.out.print(ch[l]);
                        if(l<2){
                            j--;
                        }
                        t = j;
                    }
                   // t++;
               }else if(i== 1&& j == 0 || t!= 0&& j == k-1 && i == 1){
                    System.out.print('|');
                    j++;
                }
                else {
                    System.out.print('-');
                }
            }
            System.out.println();
            //System.out.println(t);
        }
        //System.out.println(t);
    }
}

