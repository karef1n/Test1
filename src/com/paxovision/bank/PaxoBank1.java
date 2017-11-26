package com.paxovision.bank;

import com.bank.Ibank;

/**
 * Created by PaxoTech Student on 11/23/2017.
 */
public class PaxoBank1 {

    public static void main (String[] args){

        Ibank myAccount;
        myAccount = new CheckingAccount("3756987268256", "saad", "abdullah");
        myAccount.deposit(2000);
        myAccount.withdraw(600);
        //myAccount.
        System.out.println("Checking Account balance is " + myAccount.toString());
        System.out.println("Yeeeeee");

        //myAccount.setFirstName("Kamrul");
       // myAccount.setLastName("Arefin");
       // myAccount.setAccountNumber("12345858");
        //myAccount.balance=1000;
        //myAccount.deposit(500);
       // myAccount.withdraw(100);
        //myAccount.withdraw(100);
        //myAccount.getBalance();


        //Ibank yourAccount;
        //yourAccount = new SavingAccount("12333939");

        //yourAccount.deposit(1000,true);
        //yourAccount.deposit(1000);
        //yourAccount.withdraw(300);
        //System.out.println("Saving Account balance is " + yourAccount.toString());
       // yourAccount.setFirstName("Sharmin");
      // yourAccount.setLastName("Quraishi");
       //yourAccount.setAccountNumber("5738893389");
        //yourAccount.balance=2000;

        //yourAccount.printInterest();
        //((SavingAccount)myAccount).printInterest();

    }
}
