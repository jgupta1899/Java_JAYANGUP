package com.bank;

public class HDFC implements Bank
{

	@Override
	public boolean createAccount(int accountNumber, String customerName, double initialBalance) {
		if (initialBalance > 5000) {
			System.out.println("Welcome," + customerName + ", your BOB account number is: " + accountNumber);
			return true;
		} else {
			System.out.println("Minimum balance is 5000");
			return false;
		}
		
	}

	@Override
	public void withdraw(int accountNumber, double amount) {
		System.out.println("Withdrawal from " + accountNumber + " done.");
		
	}
	
	public void payBills() {
		System.out.println("Paying bill through HDFC account.");
	}
	

}
