package com.basic;

public class Student extends Person{
	//Student: firsName,lastName,grade ,course fees ,marks
	private int grdYear;
	private String coursName;
	private double fees;
	private int marks;
	
		
	public Student(String firstName, String lastName, int grdYear, String coursName, double fees, int marks) {

	   
       super(firstName,lastName);
		this.grdYear = grdYear;
		this.coursName = coursName;
		this.fees = fees;
		this.marks = marks;
		
		System.out.println("In Student Param ctor");
	}

	@Override
	public String toString() {
		return "Student ["+super.toString()+"grdYear=" + grdYear + ", coursName=" + coursName + ", fees=" + fees + ", marks=" + marks + "]";
	}

	public void showEventResult()
	{
		System.out.println("----------------Student's Event Result-------------");
	}
	
	
	
	
	
	

}
