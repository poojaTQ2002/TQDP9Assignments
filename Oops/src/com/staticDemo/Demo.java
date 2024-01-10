package com.staticDemo;

public class Demo
{
   static int x=10;
   int y=15;
   public Demo()
   {
	   x++;
	   y++;
   }
   public static void main(String[] args) 
   {
	Demo d1=new Demo();
	Demo d2=new Demo();
	Demo d3=new Demo();
	System.out.println(d3.x+","+d3.y);
	
   }
   
}
