package com.methodoverloading;
class Shape
{
	void calcArea(int side)
	{
		System.out.println("Area of square :"+side*side);
	}
	void calcArea(float radius)
	{
		System.out.println("Area of circle :"+3014*radius*radius);
	}
	void calcArea(int length,int breadth)
	{
		System.out.println("Area of rectangle :"+length*breadth);
	}
	
}
public class OverloadDemo
{
  public static void main(String[] args) 
  {
	  Shape circle=new Shape();
	  circle.calcArea(5f);
	  circle.calcArea(2,3);
	  
	  
}
	
	
	
	
}
