package com.Patterns;

import java.util.Scanner;

public class NumIncresingReversePyramid 
{
   public static void printPattern(int num)
   {
	  
	   for(int i=num;i>=1;i--)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(j);
	       }
		   System.out.println(" ");
	   }
	   
   }
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		printPattern(num);
   }
}
