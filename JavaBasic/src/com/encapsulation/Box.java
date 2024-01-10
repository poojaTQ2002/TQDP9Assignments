package com.encapsulation;

import java.util.Scanner;

import Constructors.Customer;

class Box1
{
	double length;  
	double width;
	double height;
	double volume;
    Box1()
		{
			
		}
    Box1(double length,double width,double height)
		 {  
		   this.length=length;
		   this.width=width;
		   this.height=height;
		   
		 }  
		 public void setLength(double length)
		  {
			  this.length=length;
		  }
		  public double getLength()
		  {
			  return length;
		  }
		  public void setWidth(double width)
		  {
			  this.width=width;
		  }
		  public double getWidth()
		  {
			  return width;
		  }
		  public void setHeight(double height)
		  {
			  this.height=height;
		  }
		  public double getHeight()
		  {
			  return height;
		  }
		  
		  public String toString()
			{
				return length+" "+width+" "+height;
			}
		  void display()
		  {
			  volume=length*width*height;
			  System.out.println("volume of box is :"+volume);
		  }
		  
}
public class Box 
{
	static Scanner sc=new Scanner(System.in);
	public static void box2(Box1 b1)
	{
		System.out.println("Enter length : ");
		(b1).setLength(sc.nextDouble());
		System.out.println("Enter width : ");
		b1.setWidth(sc.nextDouble());
		System.out.println("Enter Height : ");
		b1.setHeight(sc.nextDouble());
		
	}
 public static void main(String[] args) 
 {
	 Box1 b1=new Box1();
	 box2(b1);
		b1.display();
 }
}
