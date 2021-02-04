package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Bank Forte = new Bank();
        Forte.OpenSavingsAccount(1, 1);//accNum and rate
        Forte.OpenAccount(9);//accNum
        Forte.Update(1, 500, true);
    }
}
