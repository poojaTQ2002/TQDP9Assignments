package com.intermediate;

import java.util.Arrays;

public class ZeroAtEnd 
{
   public static void shiftZero(int ar[])
   {
	   int pos=0;
	   for(int i=0;i<ar.length;i++)
	   {
		   if(ar[i]!=0)
		   {
			   ar[pos]=ar[i];
			   pos++;
		   }
	   }
	   while(pos<ar.length)
	   {
		   ar[pos]=0;
		   pos++;
	   }
   }
   public static void main(String[] args)
   {
	  int arr[]= {0,4,0,9,0,7,0,6,3};
	  System.out.println(Arrays.toString(arr));
	  shiftZero(arr);
	  System.out.println("After Shifting elements :");
	  System.out.println(Arrays.toString(arr));
   }
}
