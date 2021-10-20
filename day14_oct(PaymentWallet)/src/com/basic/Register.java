package com.basic;

import java.util.Random;
import java.util.Scanner;

public class Register {

	static String name;
	static String username;
	static String password;

	Random rand = new Random();
	int acc = rand.nextInt(10000);

	public static void reg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter username");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();
	}

	public void show() {
		System.out.println("Name : " + Register.name);
		System.out.println("Username : " + Register.username);
		System.out.println("Password : " + Register.password);
		System.out.println("Account : " + acc);

	}

}
