package com.paxovision.bank;
import com.bank.Ibank;
import com.bank.Interest;

/**
 * Created by PaxoTech Student on 11/23/2017.
 */
public abstract class Account implements Ibank,Interest {

    private String firstName;
    private String lastName;
    private String accountNumber;
    protected double balance;

    public Account() {

    }

    public Account(String firstName, String lastName, String accountNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setAccountNumber(accountNumber);
    }

    public Account(String accountNumber,double balance){
        setAccountNumber(accountNumber);
        this.balance=balance;
    }

    public Account(double balance, String accountNumber){
        this.balance=balance;
        setAccountNumber(accountNumber);
    }

    public void deposit(double amount){
        deposit(amount, false);

    }

    public void deposit(double amount, boolean isThisCheck){
        if(isThisCheck){
            this.balance+=( amount* .99);
        }else {
            this.balance += amount;
        }
    }

    public void deposit (boolean isThisCheck, double amount){
        deposit(amount, isThisCheck);
    }

    public void withdraw(double amount){
        if(amount<=this.balance){
            balance-=amount;
        }
        else {

            System.out.println("not enough balance");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public  abstract double getInterest();

    public void printInterest(){
        System.out.println("Balance is " + getInterest());

    }
    public void setFirstName(String firstName) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid Name");

        }
    }

    public Account(String accountNumber){
        setAccountNumber(accountNumber);
        }

    public String getLastName()
        {
            return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid Name");
        }
    }


    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", accountNumber='" + this.accountNumber + '\'' +
                ", balance=" + this.balance +
                '}';
    }
}
