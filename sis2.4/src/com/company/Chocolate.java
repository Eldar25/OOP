package com.company;

public class Chocolate implements Comparable{
    String name;
    int weight;

    public Chocolate(String name, int w) {
        this.name = name;
        this.weight = w;
    }

    public int compareTo(Object o) {
        Chocolate ch = (Chocolate) o;
        if (ch.weight < this.weight) {
            return 1;
        }else if (ch.weight > this.weight){
            return -1;
        }
        return 0;
    }

    public String toString() {
        return "Name " + name + " Weight " + weight;
    }
}

