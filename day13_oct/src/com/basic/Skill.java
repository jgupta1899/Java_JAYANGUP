package com.basic;

public class Skill 
{
	private String skill;
	
	
	public Skill(String skill) {
		
		this.skill = skill;
	}
	
	public String getSkill()
	{
		return skill;
	}
	
	public String setSkill(String newskill)
	{
		this.skill = newskill;
		return newskill;
	}
	
	public void Skilldetails()
	{
		
		System.out.printf("%-15s",skill);
	}

}
