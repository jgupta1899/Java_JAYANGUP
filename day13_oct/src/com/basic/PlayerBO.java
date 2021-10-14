package com.basic;

public class PlayerBO 
{
	
	Player player;
	Skill skill;
	
	public  void viewDetails(String n,String c,String s)
	{
		Player p = new Player(n,c,s);
		p.printdetails();
		
	}
	
	void printPlayerDetailsWithSkill(String n,String c, String s)
	{
		Player p = new Player(n,c,s);
		p.printdetails();
	}
	
	

	
}
