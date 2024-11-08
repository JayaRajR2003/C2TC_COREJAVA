package com.tns.ifet.assignment;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 100.0;

    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account.");
        } else {
            System.out.println("Overdraft limit exceeded in Checking Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

