package com.basics;

import java.util.Arrays;

public class ArrayProduct 
{  
   public static long findProduct(int ar[])
   {
	   long product=1;
	   for(int i=0;i<ar.length;i++)
	   {
		   product=product*ar[i];
	   }
	   return product;
   }
   public static void main(String[] args) 
   {
	 int arr[]= {2,3,4,5};
	 System.out.println(Arrays.toString(arr));
	 System.out.println("Prouct is :"+findProduct(arr));
   }
}
	
