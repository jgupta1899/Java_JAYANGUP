package com.assignment21;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException 
	{
		Customer[] customers = new Customer[2];

		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Enter the details of Customer 1: ");
		System.out.println();
		String customerOne = sc.next();
		String[] customerOneArray = customerOne.split(",");

		System.out.println(Arrays.toString(customerOneArray));
		
		Date customerOneBirthdate = null,  customerOneDateEnrolled  = null;

			customerOneBirthdate = parseDate(customerOneArray[3], "dd-MMyyyy");
			customerOneDateEnrolled = parseDate(customerOneArray[6], "dd-MMyyyy");
		
	
		customers[0] = new Customer(Long.parseLong(customerOneArray[0]), customerOneArray[1], customerOneArray[2], customerOneBirthdate, 
					Double.parseDouble(customerOneArray[4]), Double.parseDouble(customerOneArray[5]), 
					customerOneDateEnrolled, Double.parseDouble(customerOneArray[7]));
		
		
		System.out.println("Enter the details of Customer 2: ");
		System.out.println();
		String customerTwo = sc.next();
		String[] customerTwoArray = customerTwo.split(",");
		System.out.println(Arrays.toString(customerTwoArray));
		
		System.out.println(Arrays.toString(customerOneArray));
		
		Date customerTwoBirthdate = null,  customerTwoDateEnrolled  = null;

		customerTwoBirthdate = parseDate(customerOneArray[3], "dd-MMyyyy");
		customerTwoDateEnrolled = parseDate(customerOneArray[6], "dd-MMyyyy");
		
		customers[0] = new Customer(Long.parseLong(customerOneArray[0]), customerOneArray[1], customerOneArray[2], customerOneBirthdate, 
					Double.parseDouble(customerOneArray[4]), Double.parseDouble(customerOneArray[5]), 
					customerOneDateEnrolled, Double.parseDouble(customerOneArray[7]));


		System.out.println("Details of customer 1: ");
		System.out.println();
		System.out.println(customers[0].toString());
		
		System.out.println();
		
		System.out.println("Details of customer 2: ");
		System.out.println();
		System.out.println(customers[1].toString());

		System.out.println();
		if (customers[0].equals(customers[1])) {
			System.out.println("Customer 1 is same as Customer 2");
		} else {
			System.out.println("Customer 1 and Customer 2 are different");
		}
		
	}
	

	private static java.util.Date parseDate(String date, String format) throws ParseException
	{
	    SimpleDateFormat formatter = new SimpleDateFormat(format);
	    return formatter.parse(date);
	}

}
