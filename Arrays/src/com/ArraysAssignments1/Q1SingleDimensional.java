package com.ArraysAssignments1;

import java.util.Arrays;

//1. WAJP2 
//a. add elements to single dimensional int array 
//b. print elements from single dimensional int array

public class Q1SingleDimensional 
{
	public static void printElements(int ar[]) 
	{
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}
   public static void main(String[] args)
   {
	 int arr[]= {1,2,3,4,5,6};
	 System.out.println(Arrays.toString(arr));
	 printElements(arr);
	 
   }
}
