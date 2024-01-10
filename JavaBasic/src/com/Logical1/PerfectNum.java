package com.Logical1;

import java.util.Scanner;

public class PerfectNum {
	public static void NumisPerfect(int n)
	{   int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			sum+=i;
			
		}
		if(sum==n)
			System.out.println(n+" is a perfect number");
			else
				System.out.println(n+" is a perfect number");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		NumisPerfect(num);
		
		
	}

}
