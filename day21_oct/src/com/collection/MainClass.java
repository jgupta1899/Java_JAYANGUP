package com.collection;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static ArrayList<Employee> populateEmp() throws ParseException
	{		
		ArrayList<Employee> emp = new ArrayList<>();
		Date doj=null;
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("29-06-2000");
		emp.add(new Employee("10000_FS","Luke","Wayne",200000,doj,new Department("254","IT","Noida"), new Address("111","line 01","Noida","UP")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("29-06-2000");
		emp.add(new Employee("12000_FS","Nell","Hartong",30000,doj,new Department("254","IT","Gurugram"), new Address("342","line 04","Gajraula","UP")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("01-04-1975");
		emp.add(new Employee("10300_JI","Hugh","Queen",25000,doj,new Department("876","Management","Pune"), new Address("343","line 01","Okhla","Delhi")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("11-12-1978");
		emp.add(new Employee("19900_SS","Olivia","Freecs",310000,doj,new Department("344","Service","Mumbai"), new Address("567","line 10","Rudrapur","Uttarakhand")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("01-01-1998");
		emp.add(new Employee("09900_HR","Theodora","Crain",45000,doj,new Department("654","HR","Bengalore"), new Address("899","line 08","Hasanpur","UP")));
		return emp;
		
		
	}
	
	
	
	public static void main(String args[]) throws ParseException
	{
		ArrayList<Employee> employeeList = populateEmp();
		for(Employee emp : employeeList)
		{
			System.out.println(emp.toString());
		}
		
		
		Scanner sc = new Scanner(System.in);
		
	
		boolean strtrue = true;
		while(strtrue)
		{
			
			System.out.println("Sort Employee");
			System.out.println("a. ByEmployeeId");
			System.out.println("b. ByFirstName");
			System.out.println("c. ByLastName");
			System.out.println("d. BySalary");
			System.out.println("e. ByAddress");
			System.out.println("f. ByDeprtment");
			
			System.out.println("Enter your choice");
			String str = sc.next();
		
			
			
			switch(str)
			{
			case "a":
				employeeList = sortByEmpId(employeeList);
				for(Employee emp : employeeList)
				{
					System.out.println(emp.toString());
				}
				System.out.println();
				
			break;
			
			case "b":
				employeeList = sortByFirstName(employeeList);
				for(Employee emp : employeeList)
				{
					System.out.println(emp.toString());
				}
				System.out.println();
				
			break;
			
			case "c":
				employeeList = sortByLastName(employeeList);
				for(Employee emp : employeeList)
				{
					System.out.println(emp.toString());
				}
				System.out.println();
				
			break;
			
			case "d":
				employeeList = sortBySalary(employeeList);
				for(Employee emp : employeeList)
				{
					System.out.println(emp.toString());
				}
				System.out.println();
				
			break;
			
			case "e":
				System.out.println("Choose Option");
				System.out.println("1. By city");
				System.out.println("2. By State");
				System.out.println("3. By address");
				System.out.println("4. By id");
				System.out.println("Enter your choice");
				int n1 = sc.nextInt();
				
				switch(n1)
				{
					case 1:
						employeeList = sortByAddressCity(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					break;
					
					case 2:
						employeeList = sortByAddressState(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					break;
					
					case 3:
						employeeList = sortByAddressLine1(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					break;
					
					case 4:
						employeeList = sortByAddressId(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					break;
				}
				
				
			break;
			
			case "f":
				System.out.println("Choose Option");
				System.out.println("1. By department id");
				System.out.println("2. By department name");
				System.out.println("3. By department location");
				System.out.println("Enter your choice");
				int n2 = sc.nextInt();
				
				switch(n2)
				{
					case 1:
						employeeList = sortByDepartmentId(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					break;
					
					case 2:
						employeeList = sortByDepartmentName(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					break;
					
					case 3:
						employeeList = sortByDepartmentLocation(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					break;
					
				
				}
				
			break;

			case "1":
				
				strtrue = false;
				
			break;
			}

		}
		
	}
	
	
	public static ArrayList<Employee> sortByEmpId(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getEmployeeID().compareTo(o2.getEmployeeID());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByFirstName(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByLastName(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortBySalary(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return ((Float)o1.getSalary()).compareTo(o2.getSalary());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByDepartmentId(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getDepartment().getDepartmentId().compareTo(o2.getDepartment().getDepartmentId());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByDepartmentName(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getDepartment().getDepartmentName().compareTo(o2.getDepartment().getDepartmentName());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByDepartmentLocation(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getDepartment().getLocation().compareTo(o2.getDepartment().getLocation());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressId(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getAddressID().compareTo(o2.getAddress().getAddressID());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressLine1(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getAddressLine1().compareTo(o2.getAddress().getAddressLine1());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressCity(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressState(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getState().compareTo(o2.getAddress().getState());
			}
		});
		return emplist;
	}

}
