package com.bank;

public class BOB implements Bank
{

	@Override
	public boolean createAccount(int accountNumber, String customerName, double initialBalance) {
	
		if (initialBalance > 1000) {
			System.out.println("Welcome," + customerName + ", your BOB account number is: " + accountNumber);
			return true;
		} else {
			System.out.println("Minimum balance is 1000");
			return false;
		}
	}

	@Override
	public void withdraw(int accountNumber, double amount) {
		System.out.println("Withdrawal from " + accountNumber + " done.");

	}
	

}
