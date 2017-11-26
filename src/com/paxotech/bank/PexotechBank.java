package com.paxotech.bank;

import com.bank.Ibank;

/**
 * Created by PaxoTech Student on 11/24/2017.
 */
public class PexotechBank {

    public static void main (String[] args){

        Ibank myAccount= null;
        Ibank yourAccount =null;
        yourAccount =new SavingAccount();
        myAccount= new CheckingAccount();

       doBankWOrk(myAccount);
        doBankWOrk(yourAccount);

        Ibank myAccount2 = null;
        myAccount2= new com.paxovision.bank.CheckingAccount("486799679", "asdf", "sdsds");
        doBankWOrk(myAccount2);


    }

    public static void doBankWOrk(Ibank bankAccount){
        bankAccount.deposit(300);
        bankAccount.withdraw(100);
        System.out.println("Balance  " + bankAccount.getBalance());
    }
}
