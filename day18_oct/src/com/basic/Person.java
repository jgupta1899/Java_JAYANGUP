package com.basic;

public class Person {

	private String firstName;
	private String lastName;

	
	public Person()
	{
		System.out.println("In Person No agr ctor");
	this.firstName = "ABC";
	this.lastName = "MOP";
		
	}
	
	public Person(String firstName, String lastName) {
		System.out.println("In person param ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
	@Override
	public String toString()
	{
		return firstName+" "+lastName;
	}
		
	public void showEventResult()
	{
		System.out.println("Event Results :");
	}
	
	
	
}
