package com.company;


public class Sort {

    static <E extends Comparable <E>> void bubbleSort(E [] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                int cmp = array[i].compareTo(array[j]);
                if (cmp > 0) {
                    E tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
