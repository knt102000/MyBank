package com.trial.chiutsui.mybank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.trial.chiutsui.accounts.BankAccount;
import com.trial.chiutsui.accounts.CheckingAccount;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Button depositBtn;
    Button withdrawBtn;
    EditText amount;
    TextView balance;

    BankAccount currentAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentAccount = new CheckingAccount();

        balance = (TextView) findViewById(R.id.accountBalance);
        amount = (EditText) findViewById(R.id.amount);
        depositBtn = (Button) findViewById(R.id.depositBtn);
        withdrawBtn = (Button) findViewById(R.id.withdrawBtn);

        withdrawBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amountInput = amount.getText().toString();
                currentAccount.withdraw(Double.parseDouble(amountInput));
                balance.setText("Balance is " + currentAccount.getBalance());
            }
        });

        depositBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amountInput = amount.getText().toString();
                currentAccount.deposit(Double.parseDouble(amountInput));
                balance.setText("Balance is " + currentAccount.getBalance());
            }
        });

    }
}
