package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of Array :");
	  int size=sc.nextInt();
	  
	  float arr[]=new float[size];
	  System.out.println("Enter Elements :");
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  System.out.println(Arrays.toString(arr));
  }
}
