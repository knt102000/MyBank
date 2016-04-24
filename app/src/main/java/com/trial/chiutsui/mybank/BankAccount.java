package com.trial.chiutsui.mybank;

/**
 * Created by chiutsui on 4/23/16.
 */
public class BankAccount {
    private double balance;

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
