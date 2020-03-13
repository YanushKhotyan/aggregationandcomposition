package by.htp.tasks.task_4.bean_wallet;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class BankAccount
{
    private int bankAccountId;
    private int bankAccountNumber;
    private int moneyOnAccount;
    private boolean accountLock;

    public BankAccount(int bankAccountId, int bankAccountNumber, int moneyOnAccount, boolean accountLock)
    {
        this.bankAccountId = bankAccountId;
        this.bankAccountNumber = bankAccountNumber;
        this.moneyOnAccount = moneyOnAccount;
        this.accountLock = accountLock;
    }

    public int getBankAccountId()
    {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId)
    {
        this.bankAccountId = bankAccountId;
    }

    public int getBankAccountNumber()
    {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber)
    {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getMoneyOnAccount()
    {
        return moneyOnAccount;
    }

    public void setMoneyOnAccount(int moneyOnAccount)
    {
        this.moneyOnAccount = moneyOnAccount;
    }

    public boolean isAccountLock()
    {
        return accountLock;
    }

    public void setAccountLock(boolean accountLock)
    {
        this.accountLock = accountLock;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return bankAccountId == that.bankAccountId &&
                bankAccountNumber == that.bankAccountNumber &&
                moneyOnAccount == that.moneyOnAccount &&
                accountLock == that.accountLock;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(bankAccountId, bankAccountNumber, moneyOnAccount, accountLock);
    }

    @Override
    public String toString()
    {
        return "BankAccount{" +
                "bankAccountId=" + bankAccountId +
                ", bankAccountNumber=" + bankAccountNumber +
                ", moneyOnAccount=" + moneyOnAccount +
                ", accountLock=" + accountLock +
                '}';
    }
}
