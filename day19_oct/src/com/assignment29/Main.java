package com.assignment29;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the total runs scored");
			long runs = sc.nextLong();

			System.out.println("Enter the total overs faced");
			long overs = sc.nextLong();
			
			try {
				validate(overs, runs);
			} catch (OverRangeException e) {
				e.printStackTrace();
			}

	}
	
	public static void validate (long overs, long runs) throws OverRangeException {
		if (overs <= 0 || overs > 20) {
			throw new OverRangeException("Over is not in the specified range");
		} else {
			float f = runs/overs;
			System.out.println("Current Run Rate: " + f);
		}
	}
}
	

