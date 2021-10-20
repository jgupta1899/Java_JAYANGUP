package com.fruitinheritance;

public class Fruit {

	private String name;

	public Fruit(String name) {
		this.name=name;
	}
	public void taste()
	{
		System.out.println("Fruit has some taste...");
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	
}
