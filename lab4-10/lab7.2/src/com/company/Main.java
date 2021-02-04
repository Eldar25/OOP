package com.company;
import com.company.Employee;


import java.util.Arrays;
public class MinMax{


    public static class Pair {
        private static int first;
        private static int second;
        public Pair(int a,int b){
            first = a;
            second =b;
        }
        public static double getFirst()
        {
            return first;
        }
        public static double getSecond()
        {
            return second;
        }
        private static Pair minmax(int values[]) {
            Arrays.sort(values);
            return new Pair(values[0],values[values.length-1]);
        }
    }

    public static void main(String[] args) {
        int a[] = {0, 8 , -3, 20};
        MinMax m =new MinMax();
        MinMax.Pair p = Pair.minmax(a);
        System.out.println(Pair.getFirst());
        System.out.println(Pair.getSecond());

    }
}
