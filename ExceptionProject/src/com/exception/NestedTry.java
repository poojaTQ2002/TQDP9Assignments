package com.exception;

public class NestedTry 
{
   public static void main(String[] args) 
   {
	   int arr[]= {12,0,4};
		
//		try
//		{
//		   for(int i=0;i<arr.length;i++)
//		   {
//			   System.out.println("Value:"+100/arr[i]);
//		   }
//		}
		
		try
		{
			 for(int i=0;i<arr.length;i++)
			 {
				 try
				 {
					 System.out.println("Value:"+100/arr[i]); 
				 }
				 catch(ArithmeticException e)
				 {
					 System.out.println(e);
				 }
			 }
				 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

   }
}
