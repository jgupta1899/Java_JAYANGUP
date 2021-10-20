package com.basic;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String username, password;

		Scanner sc = new Scanner(System.in);
		System.out.println("Payment wallet Application");
//		System.out.println("1. Login");
//		System.out.println("2. Register \n");

		boolean str = true;
		while(str)
		{
			System.out.println("1. Login");
			System.out.println("2. Register \n");
			
			
		System.out.println("Enter you choice");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Login - Enter username and password\n");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter username");
			username = scan.nextLine();
			System.out.println("Enter password");
			password = scan.nextLine();
			Login.verlog(username, password);
			str = false;
			break;

		case 2:
			System.out.println("Register- Form \n");

			Register.reg();
			Register r = new Register();
			r.show();
			

			break;

		default:
			System.out.println("Wrong Choice");
		}


	}
	}

}
