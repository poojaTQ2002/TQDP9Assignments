package com.LoopAssignment;
/*2.	Write the program in Java to display the first ten terms of the following series:
1, 4, 9, 16,*/

public class DisplayFirst10Terms2
{
  public static void displayNumber()
  {
	  for (int i = 1; i <= 10; i++) 
          System.out.println(i * i);
  }
  public static void main(String[] args) 
  {
	  displayNumber();
  }
}
