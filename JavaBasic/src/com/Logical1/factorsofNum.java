package com.Logical1;

import java.util.Scanner;

public class factorsofNum {
	public static long calculateFactor(int num)
	{
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
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
