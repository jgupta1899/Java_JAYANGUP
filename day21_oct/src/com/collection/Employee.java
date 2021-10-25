package com.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private String employeeID;
	private String firstName, lastName;
	private float salary;
	private Date dateOfJoining;
	

	private Department department;
	private Address address;
	
	public static SimpleDateFormat sdf;
	static
	{
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", department=" + department
				+ ", address=" + address + "]";
	}
	
	public Employee(String employeeID, String firstName, String lastName, float salary, Date dateOfJoining,
			Department department, Address address) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.department = department;
		this.address = address;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
