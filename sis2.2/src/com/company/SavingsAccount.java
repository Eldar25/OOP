package com.company;

public class SavingsAccount extends Account {
    public SavingsAccount(int a) {
        super(a);

    }
    private double interestRate;


    public SavingsAccount(int a,double interestRate) {
        super(a);
        this.interestRate= interestRate;

    }

    public void addInterest(double a) {
        deposit(getBalance()*(a/100));
    }
    public String toString() {
        return super.toString() + "and Current interest: " + interestRate;

    }
}