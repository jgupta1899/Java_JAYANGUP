package com.basic;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First x and y co-oridnate");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Point2D p1 = new Point2D(x,y);
		System.out.println("Second x and y co-oridnate");
		int p = sc.nextInt();
		int q = sc.nextInt();
		Point2D p2 = new Point2D(p,q);
		
		System.out.println("First x and y co-oridnate : "+p1.getDetails());
		System.out.println("Second x and y co-oridnate : "+p2.getDetails());
		
		System.out.println("Third x and y co-oridnate");
		int xoff = sc.nextInt();
		int yoff = sc.nextInt();
		Point2D p3 = p1.createNewPoint(xoff,yoff);
		
		System.out.println("Third x and y co-oridnate : "+p3.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.println("Same");
			
		}else 
		{
			System.out.println("Different");

		}
		
		if(p1.isEqual(p3))
		{
			System.out.println("Same");
		}else 
		{
			System.out.println("Different");

		}
		sc.close();

	}

}
