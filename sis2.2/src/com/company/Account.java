package com.company;
public class Account
{
    private double balance; //The current balance
    private int accNumber; //The account number

    public Account(int a)
    {
        balance=0.0;
        accNumber=a;
    }

    public void deposit(double sum) { balance+=sum; }


    public void withdraw(double sum) {balance-=sum; }


    public double getBalance(){
        return balance;}


    public double getAccountNumber(){
        return accNumber;}


    public void transfer(double amount, Account other){
        balance-=amount;
        other.balance+=amount;
    }



    public String toString() {
        return "Account:" + accNumber + ". Balance: " + balance;

    }
    public final void print()
    {
        System.out.println( toString() );
    } }