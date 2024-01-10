package com.LoopAssignment;
//4.	 WAP to show the use of break statement ( in for loop)
public class BreakStatement {
	public static void checkbreak()
	{
		for (int i = 0; i < 10; i++)
		{
			  if (i == 4)
			  {
			      break;
		      }
			  System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		checkbreak();
		
	}


}
