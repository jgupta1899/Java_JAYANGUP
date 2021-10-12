package com.basic;

import java.util.Scanner;

public class Demo {

	public static void printArea(int[] x, int[] y){
		 //find area of triangle
		
		int area = Math.abs(x[0]*(y[1]-y[2])+ x[1]*(y[2]-y[0]) + x[2]*(y[0]-y[1]))/2;
		 System.out.println("Area of Triangle: " + area);
		 }

	public static void main(String[] args) {
		
		System.out.println("Start");
		Scanner scan = new Scanner(System.in);
	
		int i,j;
		int[] x_c = new int[10];
		int[] y_c = new int[10];
		
		int n = scan.nextInt();
		for(i=0;i<=n-1;i++)
		{
			x_c[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		for(j=0;j<=m-1;j++)
		{
			y_c[j]=scan.nextInt();
		}
		printArea(x_c, y_c);
	}
}


