package com.basic;

import java.util.Scanner;

public class FoodMenu 
{
	
	public static void main(String args[])
	{
		int sumd= 0;
		int sums= 0;
		int sumi= 0;
		int sump= 0;
		int sumpi= 0;
		int sumpp= 0;
		int sumb= 0;
		int sumbr= 0;
		int sumf= 0;
		
		Boolean str = true;
		while(str)
		{
			
		System.out.println("Food Item");
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. Idli");
		System.out.println("4. Pasta");
		System.out.println("5. Pizza");
		System.out.println("6. Pani puri");
		System.out.println("7. Bhel");
		System.out.println("8. Burger");
		System.out.println("9. Fires");
		System.out.println("10. Generate Bill");
		System.out.println("11. Exit");
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				int dp = 150;
				System.out.println("Dosa : "+dp);
				System.out.println("Enter the Quantity :");
				int qd = sc.nextInt();
				sumd = dp * qd;
				break;
				
			case 2:
				int sp = 50;
				System.out.println("Samosa : "+sp);
				System.out.println("Enter the Quantity :");
				int qs = sc.nextInt();
				 sums = sp * qs;
				
				break;
				
			case 3:
				int ip = 60;
				System.out.println("Idli: "+ip);
				System.out.println("Enter the Quantity :");
				int qi = sc.nextInt();
				 sumi = ip * qi;
				
				break;
				
			case 4:
				int pp = 200;
				System.out.println("Pasta"+pp);
				System.out.println("Enter the Quantity :");
				int qp = sc.nextInt();
				 sump = pp * qp;

				
				break;
				
			case 5:
				int pip = 500;
				System.out.println("Pizza : "+pip);
				System.out.println("Enter the Quantity :");
				int qpi = sc.nextInt();
				 sumpi = pip * qpi;
				
				break;
				
			case 6:
				int ppp = 20;
				System.out.println("Pani puri : "+ppp);
				System.out.println("Enter the Quantity :");
				int qpp = sc.nextInt();
				 sumpp = ppp * qpp;

				
				break;
				
				
			case 7:
				int pb = 100;
				System.out.println("Bhel : "+pb);
				System.out.println("Enter the Quantity :");
				int bp = sc.nextInt();
				 sumb = pb * bp;

				break;
				
				
			case 8:
				int pbr = 120;
				System.out.println("Burger : "+pbr);
				System.out.println("Enter the Quantity :");
				int qbr = sc.nextInt();
				 sumbr = pbr * qbr;

				
				break;
				
			case 9:
				int pf = 100;
				System.out.println("Fires : "+pf);
				System.out.println("Enter the Quantity :");
				int qf = sc.nextInt();
				 sumf = pf * qf;

				
				break;
				
			case 10:
				
				System.out.println("Total Generate Bill : "+(sumd+sums+sumi+sump+sumpi+sumpp+sumb+sumbr+sumf));
				str = false;
				
				
				break;
			
		
		}
		
		}
		
	}

}
