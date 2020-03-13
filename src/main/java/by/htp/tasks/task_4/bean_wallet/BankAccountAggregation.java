package by.htp.tasks.task_4.bean_wallet;

import java.util.ArrayList;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class BankAccountAggregation
{
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();


    private ArrayList<BankAccount> generateBankAccounts()
    {
        BankAccount accountOne = new BankAccount(0, 1, 100, false);
        BankAccount accountTwo = new BankAccount(1, 2, -100, false);
        BankAccount accountThree = new BankAccount(2, 3, 50, false);
        BankAccount accountFour = new BankAccount(3, 4, -20, true);

        bankAccounts.set(0, accountOne);
        bankAccounts.set(1, accountTwo);
        bankAccounts.set(1, accountThree);
        bankAccounts.set(1, accountFour);

        return bankAccounts;
    }


//    private ClientWallet generateClientWallet()
//    {
//        ClientWallet clientWallet = new ClientWallet(generateBankAccounts(), sumTotalAmount(generateBankAccounts()));
//        return null;
//    }
//
//    private int sumTotalAmount(ArrayList<BankAccount> accounts)
//    {
//        int totalAmount = 0;
//        for (BankAccount wallet : accounts)
//        {
//            totalAmount += wallet.getMoneyOnAccount();
//        }
//        return totalAmount;
//    }
//
//    private int positiveMoney(ArrayList<BankAccount> accounts)
//    {
//        int totalAmount = 0;
//        for (BankAccount wallet : accounts)
//        {
//            if (wallet.getMoneyOnAccount() > 0)
//            {
//                totalAmount += wallet.getMoneyOnAccount();
//            }
//        }
//        return totalAmount;
//    }
//
//    private Train getTrainInfoByTrainNumber(ArrayList<Train> trains, int trainNumber)
//    {
//        for (Train train : trains)
//        {
//            if (train.getTrainNumber() == trainNumber)
//                return train;
//        }
//        return null;
//    }
//
//    private Train sortTrainInfoByTrainDestination(ArrayList<Train> trains, String trainDestination)
//    {
//        for (Train train : trains)
//        {
//            if (train.getTrainDestination().equalsIgnoreCase(trainDestination))
//            {
//                return train;
//            }
//        }
//        return null;
//    }
}
