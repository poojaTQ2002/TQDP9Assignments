package com.enumDemo;

public enum MovieSeats 
{
   STANDARD(300),PREMINUM(450),RECLINER(600);
	int price;
	private MovieSeats(int price)
	{
		this.price=price;
	}
	
}
