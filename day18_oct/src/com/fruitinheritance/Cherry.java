package com.fruitinheritance;

public class Cherry extends Fruit {

	public Cherry(String name) {
		super(name);
	
	}

	@Override
	public void taste() {
	System.out.println("Cherry are juicy and sweet");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
