package com.trial.chiutsui.accounts;

import com.trial.chiutsui.accounts.BankAccount;

/**
 * Created by chiutsui on 4/24/16.
 */
public class SavingsAccount extends BankAccount {
    private static final String TAG="SavingsAccount";

    @Override
    public void withdraw(double amount) {
        if (withdrawCount()>=3) {
            return;
        }

        super.withdraw(amount);
    }
}
