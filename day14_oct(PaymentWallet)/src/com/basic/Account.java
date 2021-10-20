package com.basic;

import java.util.Scanner;

public class Account 
{

	public static void acc()
	{
		float amt = 0;
		float amtnew = 0;
    	
    	
    	
    	boolean str = true;
    	while(str)
    	{
    		System.out.println("1. Add money");
        	System.out.println("2. Check account balance");
        	System.out.println("3. Transfer Funds to another account");
        	System.out.println("4. EXIT");

    		System.out.println("Enter your choice");
        	Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	
        	switch(n)
        	{
        		case 1:
        			System.out.println("Adding Money to account");
                	Scanner scan = new Scanner(System.in);
                	amt = sc.nextFloat();
                	amtnew = amtnew + amt;
                	
                	break;
                	
        		case 2:
        			System.out.println("Account balance");
                	System.out.println(amtnew);
                	
                	break;
                	
        		case 3:
        			System.out.println("Transfer to another account");
                	Scanner scan2 = new Scanner(System.in);
                	System.out.println("Enter account number");
                	int accnum = scan2.nextInt();
                	int length = String.valueOf(accnum).length();
                	if (length >= 5)
                	{
                    	System.out.println("Account Number is verified");
                    	System.out.println("Enter IFSC Code");
                    	int ifsc = scan2.nextInt();
                    	
                    	System.out.println("Enter Amount");
                    	int amt1 = scan2.nextInt();
                    	if(amt1 <= amtnew)
                    	{
                        	System.out.println("Are you sure you want to transfer the amount. Please type(Yes/No)");
                        	String reply = scan2.next();
                        	if(reply.equals("Yes"))
                        	{
                        		System.out.println("Transfered Successfully");
                        		amtnew = amtnew - amt1;
                        	}else if(reply.equals("No"))
                        	{
                        		System.out.println("Transfered Unsuccessfully");
                        	}else
                        	{
                        		System.out.println("There is some error");

                        	}

                    	}
                    	

                	}
                	
                	
                	break;
                	
        		case 4:
        			System.out.println("Thank You");
        			str = false;
                	
                	break;
        			
        	}
    	}
    	
    	
	}
	
	
}
