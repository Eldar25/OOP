package com.company;
public class CheckingAccount extends Account {
    private int cnt=0;
    private int FREE_TRANSACTIONS=0;
    public CheckingAccount(int a) {
        super(a);

    }
    public CheckingAccount(int a,int amount) {
        super(a);
        FREE_TRANSACTIONS= amount;

    }
    public void deductFee() {
        cnt++;
        if(FREE_TRANSACTIONS>0) {

            FREE_TRANSACTIONS--;
        }
        else withdraw(0.02);
    }
    public void deposit(double sum) {
        super.deposit(sum);
        deductFee(); }


    public void withdraw(double sum) {
        super.withdraw(sum);
        deductFee();}

    public String toString() {
        return super.toString() + "Number of transactions: " + cnt ;

    }
}
