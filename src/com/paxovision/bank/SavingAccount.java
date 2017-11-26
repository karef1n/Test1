package com.paxovision.bank;

/**
 * Created by PaxoTech Student on 11/24/2017.
 */
public class SavingAccount extends Account {
    public SavingAccount( String accountNumber ) {
        super(accountNumber);
    }

    @Override
    public double getInterest() {
        return getBalance()* .99;
    }

    public SavingAccount(double balance){
        //super();
        super.deposit(balance);
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        super.withdraw(balance);
    }
}
