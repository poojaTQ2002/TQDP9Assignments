package com.Patterns;

import java.util.Scanner;

public class SuarePatternLab 
{
   public static void printPattern(int num)
   {
	   int i,j;
	   int temp=1;
	   for(i=1;i<=num;i++)
	   {
		   for(j=1;j<=num;j++)
		   {
			  System.out.print(temp);
			  if(temp==1)
			  {
				  temp=0;
			  }
			  else
			  {
				  temp=1;
			  }
		   }
		   System.out.println();
	   }
	   
   }
   public static void main(String[] args) 
   {
	 /*Scanner sc=new Scanner(System.in);
	 System.out.println("Enter num of rows :");
	 int num=sc.nextInt();*/
	 printPattern(5);
   }
}
