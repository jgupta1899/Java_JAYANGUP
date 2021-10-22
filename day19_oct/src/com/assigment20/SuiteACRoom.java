package com.assigment20;

public class SuiteACRoom extends HotelRoom
{
	protected int ratePerSqFeet;
	
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = 15;
	}

	public int getRatePerSqFeet() {
		if (hasWifi) {
			return (ratePerSqFeet + 2);
		}
		return ratePerSqFeet;
	}
}
