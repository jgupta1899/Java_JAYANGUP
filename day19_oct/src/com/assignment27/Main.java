package com.assignment27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		try
		{
			BufferedReader reader = new BufferedReader(
		            new InputStreamReader(System.in));
			System.out.println("Enter the total runs scored");
			int totalrunsscored =Integer.parseInt(reader.readLine());
			System.out.println("Enter the total overs faced");
			int totaloversfaced =Integer.parseInt(reader.readLine());
			
			int runrate = totalrunsscored/totaloversfaced;
			
			
		}catch(IOException ne)
		{
			System.out.println("Error : "+ne);
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Error : "+ne);
		}catch(ArithmeticException ae)
		{
			System.out.println("Error : "+ae);
		}catch(Exception ae)
		{
			System.out.println("Error : "+ae);
		}

}
}