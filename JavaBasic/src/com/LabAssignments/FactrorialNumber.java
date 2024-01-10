package com.LabAssignments;

import java.util.Scanner;

public class FactrorialNumber 
{
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			System.out.println("Factorial of "+i+" is :"+fact);
		}
		return fact;
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		factorial(num);
	}
}
