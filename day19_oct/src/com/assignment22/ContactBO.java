package com.assignment22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactBO 
{
	static Customer createCustomer(String line) throws ParseException 
	{
		System.out.println("Enter the details");
		String[] array = line.split(",");
		Date birthdate = null,  dateEnrolled  = null;

		birthdate = parseDate(array[3], "dd-MM-yyyy");
		dateEnrolled = parseDate(array[6], "dd-MM-yyyy");
		
		
		return new Customer(Long.parseLong(array[0]), array[1], array[2], birthdate, 
				Double.parseDouble(array[4]), Double.parseDouble(array[5]), dateEnrolled, Double.parseDouble(array[7]));
		
	}
	
	
	
	static List<Customer> findCustomer(List<Customer> customerList,String name) 
	{
		List<Customer> tempList = new ArrayList<Customer>();
		for (Customer c : customerList) {
			if (c.getName().equals(name))
				tempList.add(c);
		}
		if (!tempList.isEmpty()) {
			return tempList;
		}
		return null;
	}
	
	
	static List<Customer> findCustomer(List<Customer> customerList,Date birth) {
		List<Customer> tempList = new ArrayList<Customer>();
		for (Customer c : customerList) {
			if (c.getBirthdate().equals(birth))
				tempList.add(c);
		}
		if (!tempList.isEmpty()) {
			return tempList;
		}
		return null;
	}
	
	static List<Customer> findCustomer(List<Customer> customerList,Double rating) {
		List<Customer> tempList = new ArrayList<Customer>();
		for (Customer c : customerList) {
			if (c.getRating() == rating)
				tempList.add(c);
		}
		if (!tempList.isEmpty()) {
			return tempList;
		}
		return null;
	}

	private static java.util.Date parseDate(String date, String format) throws ParseException
	{
	    SimpleDateFormat formatter = new SimpleDateFormat(format);
	    return formatter.parse(date);
	}

}
