package com.bank;

/**
 * Created by PaxoTech Student on 11/24/2017.
 */
public interface Ibank {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
