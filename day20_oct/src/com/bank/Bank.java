package com.bank;

public interface Bank {
	
	boolean createAccount(int accountNumber, String customerName, double initialBalance);
	
	void withdraw(int accountNumber, double amount);

}
