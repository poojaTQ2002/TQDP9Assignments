package com.basics;

import java.util.Arrays;

public class SumOfEven 
{  
	public static int findSumOfEven(int ar[])
	{   int sumEven=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sumEven=sumEven+ar[i];
			}
		}
		return sumEven;
	}
	
	public static int findSumOfOdd(int ar[])
	{   int sumOdd=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				sumOdd=sumOdd+ar[i];
			}
		}
		return sumOdd;
	}
   public static void main(String[] args) 
   {
	  int arr[]= {1,2,3,4,5,6,7,8,9,10};
	  System.out.println(Arrays.toString(arr));
	  System.out.println("Sum of Even is :"+findSumOfEven(arr));
	  System.out.println("--------------------------------");
	  System.out.println("Sum of Odd is :"+findSumOfOdd(arr));
	  
   }
}
