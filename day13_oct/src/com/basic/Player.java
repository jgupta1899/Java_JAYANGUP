package com.basic;

public class Player 
{
	private String name;
	private String country;
	private String str;
	
	public Player(String name,String country,String str)
	{
		this.name = name;
		this.country = country;
		this.str = str;
	}
	
	public void printdetails()
	{
		
		System.out.printf("%-15s %-15s %-15s \n", name, country, str);
	}

	
	
}
