package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum 
{
	public static int findSum(int ar[])
	   {
		   int sum=0;
		   for(int i=0;i<ar.length;i++)
		   {
			   sum=sum+ar[i];
		   }
		   return sum;
	   }
	   public static void main(String[] args) 
	   {
		   int arr[]= {2,3,4,5,6};
		   System.out.println(Arrays.toString(arr));
		   
		   System.out.println("Sum is :"+findSum(arr));
		   
		   
	   }
}
