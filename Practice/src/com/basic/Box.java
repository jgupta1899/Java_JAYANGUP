package com.basic;

public class Box 
{
	int l,w,h;
	public Box(int l, int w , int h)
	{
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	boolean isEqual(Box b)
	{
		return this.l == b.l && this.w == b.w && this.h == b.h;
	}

	
	public static void main(String args[])
	{
		Box b1 = new Box(1,5,6);
		Box b2 = new Box(1,4,6);
		System.out.println(b1.isEqual(b2));
		
	}
}
