package com.basic;

public class Point2D 
{
	private int x,y;
	
	public Point2D(int p , int q)
	{
		x = p ;
		y = q ;
		
	}
	
	
	public String getDetails()
	{
		return "Point ("+x+","+y+")";
	}

	
	public boolean isEqual(Point2D p2)
	{
		return x == p2.x && y == p2.y;
	}
	
	
	public Point2D createNewPoint(int xOff,int yOff)
	{
		return new Point2D(x+xOff,y+yOff);
		
	}
	
}
