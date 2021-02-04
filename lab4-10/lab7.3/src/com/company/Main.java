package com.company;

import java.util.Arrays;

public class Main{




    public static void main(String[] args) {
        int a[] = {0, 8 , -3, 20};
        Main m =new Main();
        Main.Pair p = Pair.minmax(a);
        MinMax.minmax(a).getFirst();
        System.out.println(MinMax.Pair.getFirst());
        System.out.println(MinMax.Pair.getSecond());

    }
}



