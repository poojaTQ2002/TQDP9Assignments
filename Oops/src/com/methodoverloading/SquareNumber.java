package com.methodoverloading;
class Square
{
	void clacsquare(int num)
	{
		System.out.println("square of int is :"+num*num);
	}
	void clacsquare(float num)
	{
		System.out.println("square of float is :"+num*num);
	}
	void clacsquare(double num)
	{
		System.out.println("square of double is :"+num*num);
	}
	
}
public class SquareNumber 
{
   public static void main(String[] args)
   {
	  Square s1=new Square();
	  s1.clacsquare(5);
	  s1.clacsquare(5d);
	  s1.clacsquare(2f);
   }
}
