package com.basic;

import java.util.Scanner;

public class BankEmployee 
{
	int bal;
	double bnkacnt;
	String custname;
	static float roi = 11.0F;
	
	public BankEmployee(int bal,double bnkacnt,String custname)
	{
		this.bal = bal;
		this.bnkacnt = bnkacnt;
		this.custname = custname;
	}
	
	public void getDetails()
	{
		System.out.println("Name of Cust : "+custname);
		System.out.println("Bank Account number : "+bnkacnt);
		System.out.println("Balance Amt : "+bal);
		
	}
	
	public static void getRate()
	{
		
		System.out.println("Rate of interest : "+roi);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the Bank account number");
		double bnkacnt = sc.nextDouble();
		System.out.println("Enter the Balance");
		int bal = sc.nextInt();
		
		BankEmployee be = new BankEmployee(bal,bnkacnt,name);
		be.getDetails();
		getRate();
		
	}

}
