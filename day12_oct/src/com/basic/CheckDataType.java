package com.basic;

import java.util.Scanner;
import java.lang.Math.*;

public class CheckDataType {
	public static void main(String args[]) {
	    double minDouble = Double.MIN_VALUE;
	    double maxDouble = Double.MAX_VALUE;
	    double countDouble = 0;
	    double averageDouble;
		System.out.println("Start");
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		if (input.hasNextDouble() && input1.hasNextDouble()) {
			
			double in1 = input.nextDouble();
			double in2 = input1.nextDouble();
			System.out.println("This input is of type Double.");
			  maxDouble = Math.max(in1, maxDouble);
	            minDouble = Math.min(in2, minDouble);
	            countDouble++;
	            averageDouble =  (maxDouble + minDouble) / countDouble; 
	            System.out.println("Average : "+averageDouble);
	           
		} else {
			System.out.println("Not Double type");
			System.exit(0);
		}
	}

}
