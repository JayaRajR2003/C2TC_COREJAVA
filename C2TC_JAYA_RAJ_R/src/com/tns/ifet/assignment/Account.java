package com.tns.ifet.assignment;

public abstract class Account {
	
	protected double balance;

    // Abstract methods for deposit, withdraw, and getBalance
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method for displaying balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }


}
