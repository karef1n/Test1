package com.paxovision.bank;

/**
 * Created by PaxoTech Student on 11/24/2017.
 */
public class CheckingAccount extends Account {

    public  CheckingAccount(String accountNumber, String firstName, String lastName){
        super(accountNumber);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.deposit(balance);
    }
     public void CheckingAccount(double balance){

        super.deposit(balance);
     }

     public CheckingAccount(double withdraw){
         super.withdraw(balance);
     }
    @Override
    public double getInterest() {
        return getBalance()* .99;
    }
}
