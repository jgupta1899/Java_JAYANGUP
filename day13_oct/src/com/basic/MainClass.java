package com.basic;

import java.util.Scanner;

public class MainClass {

	static String[] name = new String[10];
	static String[] country = new String[10];;
	static String[] skill = new String[10];;
	public static void main(String[] args) 
	{
		Player p = new Player("Jayant","India","All");
		p.printdetails();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number of Players ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.printf("Enter player %d details : \n",i);
			
			System.out.println("Enter player name :");
			name[i-1] = sc1.nextLine();
			
			System.out.println("Enter country name :");
			country[i-1] = sc1.nextLine();
			
			System.out.println("Enter skill :");
			skill[i-1] = sc1.nextLine();

			
		}
		
		
		
	
		boolean sss = true;
		while(sss)
		{
			System.out.println("Menu :");
			System.out.println("1.View details ");
			System.out.println("2.Filter players with skill ");
			System.out.println("3.Exit ");
			
			System.out.println("Enter your choice");
			int c = sc.nextInt();
			
		switch (c)
		{
				case 1:
					System.out.println("View Details");
					System.out.printf("%-15s %-15s %-15s \n", "Player", "Country", "Skills");

					PlayerBO pb = new PlayerBO();
					for(int j=1;j<=n;j++)
					{
						pb.viewDetails(name[j-1],country[j-1],skill[j-1]);
					}
					
					break;
				
				case 2:
					System.out.println("Filter players with skill");
					
					System.out.println("Enter the skill");
					String sk = sc.next();
					
					System.out.printf("%-15s %-15s %-15s \n", "Player", "Country", "Skills");

					PlayerBO pb1 = new PlayerBO();
					for(int j=1;j<=n;j++)
					{
						if(sk.equals(skill[j-1]))
						{
							pb1.viewDetails(name[j-1],country[j-1],skill[j-1]);
						}
						
					}
					
					break;
				
				case 3:
					
					sss = false;
					System.out.println("System Exit");
					
					break;
				
				default:
					
					System.out.println("Wrong Input");
					
					
				
		}
		}

	}

}
