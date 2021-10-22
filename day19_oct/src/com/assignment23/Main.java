package com.assignment23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String agrs[]) {
		try {
			Scanner sc = new Scanner(System.in);
			boolean str = true;
			while (str) {
				System.out.println("1.Validate Age\n2.Validate Name\n3.Lucky Customer\n4.Exit\nEnter your choice:");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:

					System.out.println("Enter birthdate:");
					String birthdate = sc.next();
					if (validateAge(parseDate(birthdate, "dd-MM-yyyy"))) {
						System.out.println("Age is valid");
					} else {
						System.out.println("Age is invalid");
					}
					break;

				case 2:

					System.out.println("Enter Name:");
					String name = sc.next();
					if (validateName(name)) {
						System.out.println("Name is valid");
					} else {
						System.out.println("Name is invalid");
					}
					break;

				case 3:

					System.out.println("Enter Mobile Number:");
					String number = sc.next();
					if (validateLuckyCustomer(number)) {
						System.out.println("Lucky Customer");
					} else {
						System.out.println("Unlucky Customer");
					}
					
					break;
					
				case 4:

					str = false;
					break;
				}

			}
		} catch (Exception ae) {

		}
	}
	
	
	static Boolean validateLuckyCustomer(String number) {

		int s1 = 0;
		for(int i = 0; i<=number.length();i++)
		{
			s1 = s1 + number.charAt(i);
		}
		
		int s2 = 0;
		String sum1 = String.valueOf(s1);
		for(int i = 0 ; i<= sum1.length(); i++)
		{
			s2 = s2 + sum1.charAt(i);
		}
		
		int s3 = 0;
		String sum2 = String.valueOf(s2);
		for(int i = 0 ; i<= sum2.length(); i++)
		{
			s3 = s3 + sum2.charAt(i);
		}
		
		if(s3 == 1)
		{
			return true;
		}
		
		return false;
	}


	static Boolean validateAge(java.util.Date birth)
	{
		Calendar today = Calendar.getInstance();
		Calendar birthdate = Calendar.getInstance();
	    int age = 0;

		birthdate.setTime(birth);
		
		if(birthdate.after(birth))
		{
	        throw new IllegalArgumentException("Can't be born in the future");

		}
		
	    age = today.get(Calendar.YEAR) - birthdate.get(Calendar.YEAR);
	    if ( (birthdate.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) > 3) ||
	            (birthdate.get(Calendar.MONTH) > today.get(Calendar.MONTH ))){
	        age--;

	    }else if ((birthdate.get(Calendar.MONTH) == today.get(Calendar.MONTH )) &&
	              (birthdate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH ))){
	        age--;
	    }
		
		if (age >= 18) {
	    	return true;
	    }
		return false;

		
	}
	
	static Boolean validateName(String name) {
		if (Pattern.matches("[a-zA-Z]+",name)) { 
			return true;
		}
		return false;
	}
	
	private static java.util.Date parseDate(String date, String format) throws ParseException
	{
	    SimpleDateFormat formatter = new SimpleDateFormat(format);
	    return formatter.parse(date);
	}

}
