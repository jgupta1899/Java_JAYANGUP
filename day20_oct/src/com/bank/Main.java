package com.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		boolean str = true;
		while(str)
		{
			System.out.println("Choose your Bank -- BOB | HDFC");
			String bankName = sc.next();
			
			if(bankName.equals("BOB"))
			{
				System.out.println("1. Create account");
				System.out.println("2. Withdraw");
				BOB bob = new BOB();

				System.out.println("Choose.....1 | 2");
				int n = sc.nextInt();
				switch(n)
				{
					case 1:
						
						System.out.println("Enter account number");
						int accountNumber = sc.nextInt();
						System.out.println("Enter your name");
						String customerName = sc.next();
						System.out.println("Enter initial balance");
						int initialBalance = sc.nextInt();
						bob.createAccount(accountNumber, customerName, initialBalance);
					
					break;

					case 2:
						System.out.println("Enter account number");
						int accountNumber1 = sc.nextInt();
						System.out.println("Enter amount to withdraw");
						double amount = sc.nextDouble();
						
						bob.withdraw(accountNumber1, amount);
						
					break;

				}
			}else if(bankName.equals("HDFC"))
			{
				
				System.out.println("1. Create account");
				System.out.println("2. Withdraw");
				System.out.println("3. Pay Bill");
				HDFC hdfc = new HDFC();

				System.out.println("Choose.....1 | 2 | 3");
				int n = sc.nextInt();
				switch(n)
				{
					case 1:
						
						System.out.println("Enter account number");
						int accountNumber = sc.nextInt();
						System.out.println("Enter your name");
						String customerName = sc.next();
						System.out.println("Enter initial balance");
						int initialBalance = sc.nextInt();
						hdfc.createAccount(accountNumber, customerName, initialBalance);
					
					break;

					case 2:
						System.out.println("Enter account number");
						int accountNumber1 = sc.nextInt();
						System.out.println("Enter amount to withdraw");
						double amount = sc.nextDouble();
						
						hdfc.withdraw(accountNumber1, amount);
						
					break;
					
					case 3:
						System.out.println("Enter Type of bill");
						int bill = sc.nextInt();
						System.out.println("Enter amount to pay bill");
						double amount1 = sc.nextDouble();

						hdfc.payBills();

				}
				
				
			}else
			{
				System.out.println("Invalid Bank");

			}
			
		}
	}

}
