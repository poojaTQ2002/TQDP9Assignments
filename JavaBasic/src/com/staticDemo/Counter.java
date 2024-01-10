package com.staticDemo;

public class Counter 
{
  int a=10;
  static int y=10;
  void display() 
  {
	  a++;
	  y++;
	  System.out.println("a :"+a);
	  System.out.println("y :"+y);
  }
  public static void main(String args[])
  {
	  Counter c1=new Counter();
	  Counter c2=new Counter();
	  Counter c3=new Counter();
	  c1.display();
	  c2.display();
	  c3.display();
  }
  
}
