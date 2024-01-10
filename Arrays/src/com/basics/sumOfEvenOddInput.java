package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfEvenOddInput 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  int arr[]=new int[6];
	  System.out.println("Enter 6 elements :");
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  System.out.println(Arrays.toString(arr));
	  System.out.println("Sum of Even is :"+SumOfEven.findSumOfEven(arr));
	 
	  System.out.println("Sum of Odd is :"+SumOfEven.findSumOfOdd(arr));
   }
}
