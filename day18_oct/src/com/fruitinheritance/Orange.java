package com.fruitinheritance;

public class Orange extends Fruit {

	public Orange(String name) {
		super(name);
	}

	@Override
	public void taste() {
	System.out.println("Oranges are sour and sweet");
	}

	@Override
	public String toString() {
			return super.toString();
	}

	// special method of child class
	public void makeJuice()
	{
		System.out.println("Making organe juice");
	}
	
	
	
}
