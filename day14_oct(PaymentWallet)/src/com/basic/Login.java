package com.basic;

import java.util.Random;
import java.util.Scanner;

public class Login {
	static String username;
	static String password;

	public static void log() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();
	}

	public static void verlog(String username, String password) {
		if (Register.username.equals(username) && Register.password.equals(password)) {
			System.out.println("Login Successfully");
			Account.acc();
		} else {
			System.out.println("Login Unsuccessfully");
		}

	}

}
