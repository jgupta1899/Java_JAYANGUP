package com.assigment20;


public class DeluxeACRoom extends DeluxeRoom
{
	int ratePerSqFeet;

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = 12;

	}


}
