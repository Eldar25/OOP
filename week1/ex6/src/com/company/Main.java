package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] ar =s.toCharArray();
        String s1="";
        int anton = 0;
        int danic = 0;
        for(int i = 0 ; i < s.length(); i++){
            //System.out.println(ar[i]);
            if(ar[i] == 'A'){
                anton++;
            }else {
                danic++;
            }
        }
        if (anton > danic) {
            System.out.println("Anton");
        }else if (danic > anton){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
	// write your code here
    }
}
