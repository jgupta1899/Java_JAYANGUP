package com.basic;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 int i,fact=1;  
		 System.out.println("Enter the number");
		 int number = sc.nextInt();
		
		 for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
