package com.basic;

import java.util.Scanner;

public class Operations 
{
	public static void main(String args[])
	{

		
		Boolean str = true;
		while(str)
		{
			System.out.println("Enter your choice");
			
			System.out.println("Addition : click 1");
			System.out.println("Subtraction : click 2");
			System.out.println("Divison : click 3");
			System.out.println("Multiplication : click 4");
			System.out.println("You want to quit : click 5");
			
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("Enter First Number");
					double num = scan.nextDouble();
					System.out.println("Enter Second Number");
					double num1 = scan.nextDouble();
					
					System.out.println("Addition : "+(num+num1));
					
				break;	
				
				case 2:
					System.out.println("Enter First Number");
					double num2 = scan.nextDouble();
					System.out.println("Enter Second Number");
					double num21 = scan.nextDouble();
					
					System.out.println("Subtraction : "+(num2-num21));
					
				break;
				
				case 3:
					System.out.println("Enter First Number");
					double num3 = scan.nextDouble();
					System.out.println("Enter Second Number");
					double num31 = scan.nextDouble();
					
					System.out.println("Divison : "+(num3/num31));
					
				break;
				
				case 4:
					System.out.println("Enter First Number");
					double num4 = scan.nextDouble();
					System.out.println("Enter Second Number");
					double num41 = scan.nextDouble();
					
					System.out.println("Multiplication : "+(num4*num41));
					
				break;
				
				case 5:
					
					str = false;
					System.out.println("System exit");
				break;
			
			}
		}
		
	}

}
