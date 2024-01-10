package com.Patterns;

import java.util.Scanner;

public class PatternLab 
{ public static void printPattern1(int num) 
{ 
	int i,j;
	for(i=1;i<=num;i++)
	{
		for(j=1;j<=i;j++)
	      {
			if((j%2)!=0)
			{
				System.out.print(" 1");
				
			}
			else
			{
				System.out.print("#");
			}
	
		  }
		System.out.println();
	}
	
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter num of rows :");
	 int num=sc.nextInt();
	 printPattern1(num);
}
  
  
}
