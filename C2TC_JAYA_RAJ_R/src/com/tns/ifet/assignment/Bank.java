package com.tns.ifet.assignment;

public class Bank {
	
	  // Static variable to keep track of the total number of bank accounts
    private static int totalAccounts = 0;

    // Static method to get the total number of bank accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Constructor to increment total accounts whenever a new account is created
    public Bank() {
        totalAccounts++;
    }

}
