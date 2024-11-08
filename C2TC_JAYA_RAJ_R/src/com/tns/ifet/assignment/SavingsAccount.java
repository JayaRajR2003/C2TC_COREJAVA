package com.tns.ifet.assignment;

//SavingsAccount.java
class SavingsAccount extends Account {
 private double interestRate;

 public SavingsAccount(double initialBalance, double interestRate) {
     this.balance = initialBalance;
     this.interestRate = interestRate;
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited $" + amount + " into Savings Account.");
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew $" + amount + " from Savings Account.");
     } else {
         System.out.println("Insufficient funds in Savings Account.");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }

 // Method to add interest to the balance
 public void addInterest() {
     balance += balance * interestRate / 100;
     System.out.println("Interest added. New balance: $" + balance);
 }
}

