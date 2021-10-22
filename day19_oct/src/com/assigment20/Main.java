package com.assigment20;

import java.util.Scanner;

import com.assigment20.DeluxeRoom;
import com.assigment20.HotelRoom;
import com.assigment20.DeluxeACRoom;
import com.assigment20.SuiteACRoom;

public class Main {

	public static void main(String[] args) 
	{
		
		boolean str = true;
		while(str)
		{
			System.out.println("Hotel Tariff Calculator");
			System.out.println("1.	Deluxe Room");
			System.out.println("2.	Deluxe AC Room");
			System.out.println("3.	Suite AC Room");
			System.out.println("4.	Exit");
			
			Scanner sc =new Scanner(System.in);
			int n = sc.nextInt();

			switch(n)
			{
				case 1:
					System.out.println("Enter Hotel Name : ");
					String hotelName = sc.next();
					System.out.println("Room Square Feet Area:");
					int numberOfSqFeet = sc.nextInt();
					System.out.println("Room has TV (yes/no):");
					String hasTv = sc.next();
					System.out.println("Room has Wifi (yes/no:");
					String hasWifi = sc.next();
					
					boolean hasTV = false;
					if (hasTv.equals("Yes") || hasTv.equals("YES")) {
						hasTV = true;
					}
					boolean hasWIFI = false;
					if (hasWifi.equals("Yes") || hasWifi.equals("YES")) {
						hasWIFI = true;
					}
					
					HotelRoom hr = new HotelRoom(hotelName, numberOfSqFeet, hasTV, hasWIFI);

					DeluxeRoom dr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWIFI);

					System.out.println("Room Tariff per day is: " + hr.calculateTariff(dr.calculateTariff(numberOfSqFeet)));
					
				break;
				
				
				case 2:
					System.out.println("Enter Hotel Name : ");
					String hotelName1 = sc.next();
					System.out.println("Room Square Feet Area:");
					int numberOfSqFeet1 = sc.nextInt();
					System.out.println("Room has TV (yes/no):");
					String hasTv1 = sc.next();
					System.out.println("Room has Wifi (yes/no:");
					String hasWifi1 = sc.next();
					
					boolean hasTV1 = false;
					if (hasTv1.equals("Yes") || hasTv1.equals("YES")) {
						hasTV = true;
					}
					boolean hasWIFI1 = false;
					if (hasWifi1.equals("Yes") || hasWifi1.equals("YES")) {
						hasWIFI = true;
					}
					
					HotelRoom hr1 = new HotelRoom(hotelName1, numberOfSqFeet1, hasTV1, hasWIFI1);

					DeluxeACRoom  dr1 = new DeluxeACRoom(hotelName1, numberOfSqFeet1, hasTV1, hasWIFI1);
					
					System.out.println("Room Tariff per day is: " + hr1.calculateTariff(dr1.calculateTariff(numberOfSqFeet1)));
					
				break;
				
				
				case 3:
					System.out.println("Enter Hotel Name : ");
					String hotelName2 = sc.next();
					System.out.println("Room Square Feet Area:");
					int numberOfSqFeet2 = sc.nextInt();
					System.out.println("Room has TV (yes/no):");
					String hasTv2 = sc.next();
					System.out.println("Room has Wifi (yes/no:");
					String hasWifi2 = sc.next();
					
					boolean hasTV2 = false;
					if (hasTv2.equals("Yes") || hasTv2.equals("YES")) {
						hasTV = true;
					}
					boolean hasWIFI2 = false;
					if (hasWifi2.equals("Yes") || hasWifi2.equals("YES")) {
						hasWIFI = true;
					}
					
					HotelRoom hr2 = new HotelRoom(hotelName2, numberOfSqFeet2, hasTV2, hasWIFI2);

					SuiteACRoom  dr2 = new SuiteACRoom (hotelName2, numberOfSqFeet2, hasTV2, hasWIFI2);
					
					System.out.println("Room Tariff per day is: " + hr2.calculateTariff(dr2.calculateTariff(numberOfSqFeet2)));
					
				break;
			}
			
		}

	}
}
