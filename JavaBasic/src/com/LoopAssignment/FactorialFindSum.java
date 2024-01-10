package com.LoopAssignment;

import java.util.Scanner;

public class FactorialFindSum {
	public static long calculateFactor(int num)
	{   int sum=0;
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			sum+=fact;
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println("Factorial is:"+calculateFactor(num));
		
	}

}
