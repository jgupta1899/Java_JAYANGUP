package com.assignment28;

import java.util.Scanner;

public class PlayerBO 
{
	public void displayPlayerDetails()
	{
		
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of players");
			int n = sc.nextInt();
			
			for(int i = 0; i<= n;i++)
			{
				System.out.println("Do you know the details of the captain? Type Yes / No");
				String isCaptain = sc.next();
				
				if(isCaptain.equals("Yes"))
				{
					System.out.println("Enter name of the captain");
					String captain = sc.next();
					System.out.println("Enter country of the captain");
					String captainCountry = sc.next();
					System.out.println("Enter skillset of the captain");
					String captainSkillSet = sc.next();
				}
				else if(isCaptain.equals("No"))
				{
					System.out.println("Enter name of player "+i);
					String player1 = sc.next();
					System.out.println("Enter country of player "+i);
					String player1Country = sc.next();
					System.out.println("Enter skillset of player "+i);
					String player1SkillSet = sc.next();
				}
			}
			
			
			
		}catch(NullPointerException ar)
		{
            System.out.print("Null Data");

		}
	}

	public static void main(String args[])
	{
		PlayerBO pb = new PlayerBO();
		pb.displayPlayerDetails();
	}
}
