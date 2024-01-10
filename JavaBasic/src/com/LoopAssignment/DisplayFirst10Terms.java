package com.LoopAssignment;
/*1.	Write a program in Java to display the first 10 terms of the following series:
10, 20, 30, 40, ……..*/

public class DisplayFirst10Terms
{
  public static void displayNumber()
  {
	  for(int i=10;i<=100;i+=10)
		  System.out.println(i);
  }
  public static void main(String[] args) 
  {
	  displayNumber();
  }
}
