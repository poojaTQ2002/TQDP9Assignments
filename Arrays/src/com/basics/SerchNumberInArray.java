package com.basics;

import java.util.Scanner;

public class SerchNumberInArray
{
	public static boolean findElment(int ar[],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==n)
				return true;
		}
		return false;
	}
   public static void main(String[] args) 
   {
	 Scanner sc=new Scanner(System.in);
	 int arr[]= {1,6,4,3,8,9};
	 System.out.println("Enter Element to be Search");
	 int num=sc.nextInt();
	 if(findElment(arr,num))
	 {
		 System.out.println(num+" elements is present in array");
	 }
	 else
	 {
		 System.out.println(num+" elements is not present in array");
	 }
	 
   }
}
