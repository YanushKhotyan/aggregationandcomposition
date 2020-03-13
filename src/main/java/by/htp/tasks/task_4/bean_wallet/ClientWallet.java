package by.htp.tasks.task_4.bean_wallet;

import java.util.ArrayList;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class ClientWallet
{
    private ArrayList<BankAccount> clientBankAccounts;
    private int totalAmount;
    private int positiveInvestments;
    private int debts;

    public ClientWallet(ArrayList<BankAccount> clientBankAccounts, int totalAmount, int positiveInvestments, int debts)
    {
        this.clientBankAccounts = clientBankAccounts;
        this.totalAmount = totalAmount;
        this.positiveInvestments = positiveInvestments;
        this.debts = debts;
    }


}
