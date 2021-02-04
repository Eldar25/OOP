package com.company;

public class Main {

    public static void main(String[] args) {
        Chocolate chs[]= new Chocolate[5];
        chs[0] = new Chocolate("Twix", 10);
        chs[1] = new Chocolate("Snickers", 13);
        chs[2] = new Chocolate("Mars", 14);
        chs[3] = new Chocolate("Kazakhstan", 5);
        chs[4] = new Chocolate("M&Ms", 8);
        Time tms [] = new Time[5];

        tms[0] = new Time(05,4,3);
        tms[1] = new Time(04,40,4);
        tms[2] = new Time(04,44,3);
        tms[3] = new Time(02,14,56);
        tms[4] = new Time(02,14,55);
        Sort.bubbleSort(chs);
        for(Chocolate ch : chs) {
            System.out.println(ch);
        }
        Sort.bubbleSort(tms);
        for(Time t : tms) {
            System.out.println(t);
        }
    }

}
