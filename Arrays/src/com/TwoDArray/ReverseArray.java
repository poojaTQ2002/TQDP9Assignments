package com.TwoDArray;

import java.util.Arrays;

public class ReverseArray 
{
	static void reverseArray(int a1[])
	{
		int len=a1.length;
		
		for(int i=0;i<len/2;i++)
		{
			int temp=a1[i];
			a1[i]=a1[len-i-1];
			a1[len-i-1]=temp;
			
		}
		System.out.println(Arrays.toString(a1));
	}
	static void reverse2D(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
			reverseArray(ar[i]);
		}
	}
	static void printArray(int arr[][])
	{
		 for(int i=0;i<arr.length;i++)
		   {
			   for(int j:arr[i])
			   {
				   System.out.print(j+" ");
			   }
			   System.out.println();
		   }
		   System.out.println("-----------------------");
	}
  public static void main(String[] args) 
  {
	 int arr[][]= {{1,2,3},{4,5,6}};
	 System.out.println("Original Arrays :");
	 printArray(arr);
	 
	 reverse2D(arr);
	 System.out.println("----------------------------");
	 printArray(arr);
  }
}
