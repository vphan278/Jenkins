package com.example.bank;

public class BankAccountTest {

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount();

        account.chooseAccount();
        account1.chooseAccount();


        account.depositMoney(500,1);
        account.depositMoney(400, 1);
        System.out.println("The balance for checking and savings combine: " + "$" + account.balance()); // The balance for account: $900.0
        account.withdraw(200, 1);
        System.out.println("The balance for checking and savings combine: " + "$" + account.balance()); //The balance for account: $700.0

        account.depositMoney(1000, 2);
        System.out.println("The balance for checking and savings combine:  " + "$" + account.balance());// $1700


        account1.depositMoney(150, 1);
        account1.depositMoney(200, 2);
        account1.withdraw(45, 1);
        System.out.println("The balance for checking and savings combine:  " + "$" + account1.balance());

    }

}
