package com.fruitinheritance;

public class Apple extends Fruit{

	public Apple(String name) {
		super(name);
	}

	@Override
	public void taste() {
	System.out.println("Apples are sweet in taste");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	// special method of child class
	public void createJam()
	{
		System.out.println("Apple jam created....");
	}
	
	
	
	
}
