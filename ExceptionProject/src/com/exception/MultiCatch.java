package com.exception;

import java.util.Scanner;

public class MultiCatch 
{
   public static void main(String[] args)
   {  
	   Scanner sc= new Scanner(System.in);
		
		try
		{
			int arr[]= new int[3];
			System.out.println("Enter array elements:");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]= sc.nextInt();
			}
			
			System.out.println("------------------------------");
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println("Value:"+100/arr[i]);
			}
		}
		// other catches unreachable code
		
//		catch(Exception e)
//		{
//			System.out.println("Other:"+e);
//		}
		catch(ArithmeticException e)
		{
			System.out.println(e+"->Array elements is zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"-> array is iterated to greater index");
		}
		catch(Exception e)
		{
			System.out.println("Other:"+e);
		}

   }
}
