package com.assignment30;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws DuplicateIdException {

		Scanner sc = new Scanner(System.in);

			System.out.println("Enter the team name");
			String teamName = sc.nextLine();
			System.out.println("Enter the number of players suggested");
			int numberOfPlayers = sc.nextInt();
			int[] playerIds = new int[numberOfPlayers];
			String[] playerNames = new String[numberOfPlayers];
			
			for (int i = 0; i < numberOfPlayers; i++) {
				System.out.println("Enter player " + (i+1) +" details");
				int id = sc.nextInt();
				for (int j =0; j <playerIds.length; j++ ) {
					if(id == playerIds[j]) {
						throw new DuplicateIdException("Player Id must be unique");
					}
				}
				playerIds[i] = id;
				String name = sc.next();
				playerNames[i] = name;
			}
		
		
		
		
		
		
	}

}
