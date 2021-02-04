package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        ArrayList<String> matches = new ArrayList<String>();
        //HashMap<String,String> results = new HashMap<>();
        String s = in.next();

        int n = Integer.parseInt(s);
        int nlast = n;

        //System.out.println(n);
        String s2;
        String s3 ;
        int sc1=0;
        int sc2 = 0;
        int ind1=0;
        int ind2 = 0;
        int cnt = 0;
        char[] comands = new char[n];
        int[] scores = new int[n];
        n = (n/2)*(n-1);
        for(char c = 'A'; c <= 'Z';c++){
            //System.out.println(c);
            //while (cnt < nlast){
            //    comands[cnt] = c;
            //    cnt++;
             //   if(cnt == nlast){
             //       break;
             //   }
           // }
            comands[cnt] = c;
            cnt++;
            if(cnt == nlast){
                break;
            }
        }
        //for(int i = 0 ; i < nlast; i++){
         //   System.out.println(comands[i]);
        //}
        for(int i = 0 ; i < n ; i++){
            //matches.add(in.next());
            s2 = in.next();
            s3 = in.next();
            char[] comand =s2.toCharArray();
            char[] score =s3.toCharArray();



            for(int k = 0; k < nlast ; k++){
                if(comand[0] == comands[k]){
                    ind1 = k;
                   // System.out.print(k);
                  //  System.out.print("'"+comands[k] + "'");

                }
            }
            for(int k = 0; k < nlast ; k++){
                if(comand[2] == comands[k]){
                    ind2 = k;
                }
                //System.out.print(ind2);

            }

            //for(int j =0; j < score.length; j++){
                sc1 = score[0] - 48;
                sc2 = score[2]- 48;
                //System.out.println(sc1 + " " + sc2);
                if(sc1 > sc2){
                    scores[ind1] +=3;
                }else if (sc2 > sc1){
                    scores[ind2] += 3;
                }
                else{
                    scores[ind1] += 1;
                    scores[ind2] += 1;
                }

            //}
            //System.out.println(comands.length);
        }

        for(int i = 0 ; i < nlast ; i++){
            System.out.println(comands[i] + ": " + scores[i] + " points");
        }

    }
}
