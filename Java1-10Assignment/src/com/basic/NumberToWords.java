package com.basic;

import java.util.Scanner;

public class NumberToWords 
{
	public static void main(String args[])
	{
		int number = 0 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		 try
		 {
			 number = sc.nextInt();
			 
			 if(number == 0)
			 {
				 System.out.println("Number in words : Zero");
			 }else
			 {
				 System.out.println("Number in words: " + numberToWord(number));
			 }
			 
		 }catch(Exception ae)
		 {
			 System.out.println("Error : "+ae);
		 }
		
	}
	
	private static String numberToWord(int number)
	{
		String words = "";
		
		
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                "eighteen", "nineteen" };
		
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };
		
		if(number == 0)
		{
			return "Zero";
		}
		
		if(number < 0)
			
		{
			String numberStr = "" + number; 
	        numberStr = numberStr.substring(1); 
	        return "minus " + numberToWord(Integer.parseInt(numberStr)); 
		}
		
			if ((number / 1000000) > 0) {
			   words += numberToWord(number / 1000000) + " million ";
			   number %= 1000000;
			}
			if ((number / 1000) > 0) {
			    words += numberToWord(number / 1000) + " thousand ";
			    number %= 1000;
			}
			if ((number / 100) > 0) {
			     words += numberToWord(number / 100) + " hundred ";
			     number %= 100;
			}
		
		
		if (number > 0) {
		     if (number < 20) { 
	                    words += unitsArray[number];
	             } else { 
	                words += tensArray[number / 10]; 
	                if ((number % 10) > 0) {
			    words += "-" + unitsArray[number % 10];
	                }  
		     }
	          }
		
		return words;
	}

}