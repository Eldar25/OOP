package com.company;

import java.util.Objects;

public class Bear implements Runnable {

    private double honey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bear)) return false;
        Bear bear = (Bear) o;
        return Double.compare(bear.honey, honey) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(honey);
    }

    public Bear(){}
    public Bear(double honey) {
        this.honey = honey;
    }

    @Override
    public void run() {
        while(honey != 0){
            honey--;
        }
        System.out.println(honey + " " + "bear ate honey");
    }
}
