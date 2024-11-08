package com.tns.ifet.assignment;

//Transaction.java
class Transaction {
 // Final variable for transaction fee
 private final double transactionFee;

 public Transaction(double transactionFee) {
     this.transactionFee = transactionFee;
 }

 // Final method to perform a transaction, ensuring the process is consistent
 public final void performTransaction(Account account, double amount, boolean isDeposit) {
     if (isDeposit) {
         account.deposit(amount);
     } else {
         account.withdraw(amount + transactionFee);
     }
     account.displayBalance();
 }

 public double getTransactionFee() {
     return transactionFee;
 }
}

