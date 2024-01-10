package com.methodoverloading;
class MyRoom
{
	int lenght;
	int breadth;
	int height;
	MyRoom()
	{
		lenght=breadth=height=0;
	}
	MyRoom(int lenght)
	{
		this.lenght=lenght;
		this.breadth=lenght;
		this.height=lenght;
	}
	MyRoom(int lenght,int breadth,int height)
	{
		this.lenght=lenght;
		this.breadth=breadth;
		this.height=height;
	}
	void calaArea()
	{
		System.out.println("Area of room is :"+lenght*breadth);
	}
	void calaVolume()
	{
		System.out.println("Volume is :"+lenght*breadth*height);
	}
	
	
}
public class Hotel 
{
    public static void main(String[] args)
    {
		MyRoom r1=new MyRoom(10);
		r1.calaArea();
		r1.calaVolume();
		
		MyRoom r2=new MyRoom(10,25,20);
		r2.calaArea();
		r2.calaVolume();
	}
}
