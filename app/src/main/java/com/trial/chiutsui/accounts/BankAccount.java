package com.trial.chiutsui.accounts;

import java.util.ArrayList;

/**
 * Created by chiutsui on 4/23/16.
 */
public abstract class BankAccount {
    private static final String TAG="BankAccount";

    private ArrayList<Double> mTransactions;

    private static final double OVERDRAFT_FEE=30;


    BankAccount() {
        mTransactions = new ArrayList<Double>();
    }

    protected int withdrawCount() {
        int count=0;
        for (int i = 0; i<mTransactions.size(); i++) {
            if (mTransactions.get(i)<0) {
                count++;
            }
        }
        return count;
    }

    public void withdraw(double amount) {

        mTransactions.add(-amount);

        if (getBalance()<0) {
            withdraw(-OVERDRAFT_FEE);
        }
    }

    public void deposit(double amount) {
        mTransactions.add(amount);
    }

    public double getBalance() {
        double totalBalance = 0;

        for (int i=0; i<mTransactions.size(); i++) {
            totalBalance+=mTransactions.get(i);
        }

        return totalBalance;
    }
}
