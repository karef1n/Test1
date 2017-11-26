package com.paxotech.bank;

import com.bank.Ibank;
import com.bank.Interest;

/**
 * Created by PaxoTech Student on 11/24/2017.
 */
public abstract class Account implements Ibank, Interest {
    private double balance =0.0D;

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        balance-=amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterest() {
        return 0;
    }

    @Override
    public void printInterest() {
 System.out.println( "Interest " + getInterest());
    }
}
