package com.assignment22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException 
	{
		System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating"); 

		
		Scanner sc =  new Scanner(System.in);
		
		ContactBO bo = new ContactBO();
		
		System.out.println("Enter the number of customers: ");
		int numberOfCustomers = sc.nextInt();
		List<Customer> customerList = new ArrayList<Customer>();

		for(int i = 0;i<=numberOfCustomers;i++)
		{
			customerList.add(bo.createCustomer(sc.next()));

		}
		
		System.out.println("Enter the search type:\n 1.By name \n2.By birth date \n3.By rating");
		System.out.println("Enter the type to search");
		int n = sc.nextInt();
		switch(n)
		{
			case 1: 
				System.out.println("Enter the name of the customer to be searched: ");
				String name = sc.next();
				System.out.println("Id    Name            Mobile Number   Date of Birth   Average spent amount Total amount    Date Enrolled   Rating ");

				for (Customer c : bo.findCustomer(customerList, name)) {
					System.out.println(c.getId() + " " + c.getName() + " " + c.getMobileNumber() + " " + c.getBirthdate() + " " + c.getAverageSpendAmount() + " " + c.getTotalAmount() + " " + c.getDateEnrolled() + " " + c.getRating());
				}
				
			break;
			
			case 2:
				System.out.println("Enter the birth date of the customer to be searched: ");
				String date = sc.next();
				System.out.println("Id    Name            Mobile Number   Date of Birth   Average spent amount Total amount    Date Enrolled   Rating ");

				for (Customer c : bo.findCustomer(customerList, parseDate(date, "dd-MM-yyyy"))) 
				{
					System.out.println(c.getId() + " " + c.getName() + " " + c.getMobileNumber() + " " + c.getBirthdate() + " " + c.getAverageSpendAmount() + " " + c.getTotalAmount() + " " + c.getDateEnrolled() + " " + c.getRating());
				}
				
			break;
			
			case 3:
				System.out.println("Enter the rating of the customer to be searched: ");
				double rating = sc.nextDouble();
				System.out.println("Id    Name            Mobile Number   Date of Birth   Average spent amount Total amount    Date Enrolled   Rating ");
				for (Customer c : bo.findCustomer(customerList, rating)) {
					System.out.println(c.getId() + " " + c.getName() + " " + c.getMobileNumber() + " " + c.getBirthdate() + " " + c.getAverageSpendAmount() + " " + c.getTotalAmount() + " " + c.getDateEnrolled() + " " + c.getRating());
				}
				
			break;
			
			default:
				
				System.out.println("Wrong Choice");
				
			break;
				
				
		}
		
	}


	private static java.util.Date parseDate(String date, String format) throws ParseException
	{
	    SimpleDateFormat formatter = new SimpleDateFormat(format);
	    return formatter.parse(date);
	}
}
