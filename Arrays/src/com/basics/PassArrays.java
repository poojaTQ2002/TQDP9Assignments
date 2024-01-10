package com.basics;

import java.util.Arrays;

public class PassArrays 
{
   public static void squareElements(int ar[])
   {
	   for(int i=0;i<ar.length;i++)
	   {
		   ar[i]=ar[i]*ar[i];
	   }
   }
   public static void main(String[] args) 
   {
	   int arr[]= {2,3,4,5,6};
	   System.out.println(Arrays.toString(arr));
	   squareElements(arr);
	   System.out.println(Arrays.toString(arr));
	   
   }
}
