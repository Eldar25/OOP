package com.company;
import java.util.Vector;

public class Bank {


    Vector<Account> v = new Vector<Account>();




    public void Update(int accNum,double sum,boolean q) {//if q true deposit, else withdraw operation
        for(Account g:v) {
            if(g.getAccountNumber()== accNum) {
                if(q==true) {
                    g.deposit(sum);
                    System.out.println(g.getBalance());
                    break;
                }
                else {
                    g.withdraw(sum);
                    System.out.println(g.getBalance());
                    break;}
            }
        }

    }

    public void OpenAccount(int num) {
        Account b = new Account(num);
        v.add(b);
        System.out.println(b.getBalance());
    }
    public void OpenSavingsAccount(int num,double rate) {
        Account b = new SavingsAccount(num,rate);
        v.add(b);
    }
    public void OpenCheckingAccount( int num,int fretransc) {
        Account b = new CheckingAccount(num,fretransc);
        v.add(b);
    }
    public void CloseAccount(Account b) {
        v.remove(b);
    }
}
