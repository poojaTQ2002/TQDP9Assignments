package com.basics;
import java.util.Arrays;
public class ArrayDemo 
{
   public static void main(String[] args)
   {
	  int arr[]=new int [5];
	  
	  for(int i=0;i<arr.length;i++)//if you create this before we give to default value zero.
	  {
		  System.out.println(arr[i]);
	  }
	  
	  System.out.println("-----------------------------------");
	  
	  arr[0]=90;
	  arr[1]=88;
	  arr[2]=46;
	  arr[3]=87;
	  arr[4]=60;
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println(arr[i]);
	  }
	  
	  System.out.println("---------------------------");
	  
	  int arr1[]={65,23,88,70,55};
	  System.out.println(arr1);
	  System.out.println(Arrays.toString(arr1));
	  for(int i=0;i<arr1.length;i++)
	  {
		  System.out.println(arr1[i]);
	  }
	  
   }
}
