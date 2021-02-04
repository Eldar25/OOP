package com.company;

import java.util.Arrays;

public class MinMax {
    public static class Pair {
        private static int first;
        private static int second;
        public Pair(int a,int b){
            first = a;
            second =b;
        }
        public static int getFirst()
        {
            return first;
        }
        public static int getSecond()
        {
            return second;
        }

    }
    public static Pair minmax(int values[]) {
        Arrays.sort(values);
        return new Pair(values[0],values[values.length-1]);
    }
}
