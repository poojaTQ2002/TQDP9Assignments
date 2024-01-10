package com.LoopAssignment;

import java.util.Scanner;

public class SumOfOddNum
{
	public static void calculateOddNum(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(i%2!=0)
				sum+=i;
		}
		System.out.println("Sum of all Odd Number between 1 to n is :"+sum);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		calculateOddNum(num);
	}
}



