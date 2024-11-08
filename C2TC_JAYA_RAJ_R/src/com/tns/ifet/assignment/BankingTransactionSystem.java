package com.tns.ifet.assignment;

public class BankingTransactionSystem {

	public static void main(String[] args) {
		// Create a bank instance
        //Bank bank = new Bank();

        // Create accounts
        SavingsAccount savings = new SavingsAccount(1000, 2.5); // Initial balance of $1000 and 2.5% interest rate
        CheckingAccount checking = new CheckingAccount(500); // Initial balance of $500

        // Transaction fee
        Transaction transaction = new Transaction(2.0); // $2 transaction fee

        // Perform transactions
        transaction.performTransaction(savings, 200, true); // Deposit $200 in savings
        transaction.performTransaction(savings, 100, false); // Withdraw $100 in savings
        savings.addInterest(); // Add interest

        transaction.performTransaction(checking, 300, true); // Deposit $300 in checking
        transaction.performTransaction(checking, 700, false); // Withdraw $700 in checking (overdraft test)

        // Display total accounts created
        System.out.println("Total accounts created: " + Bank.getTotalAccounts());
    

	}

}
