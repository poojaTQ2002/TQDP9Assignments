package com.LoopAssignment;
/*3.Write the program in Java to display the first ten terms of the following series:
1, 2, 4, 7, 11*/

public class DisplayFirst10Terms3
{
  public static void displayNumber()
  {   int a=1;
  		int c=0;
	  for (int i = 0; i < 10; i++)
	  {
		  c=a+i;
		  a=c;
		  System.out.println(a);
	  }
         
          
	    
  }
  public static void main(String[] args) 
  {
	  displayNumber();
  }
}
