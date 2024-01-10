package com.Logical1;

import java.util.Scanner;

public class SumReachesOneDigit {
	public static int reduceNum(int n)
	{
		int sum=0;
		while(n>0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum=sum+(n%10);
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		int ans=reduceNum(num);
		System.out.println(num+" has reduced single digit as:"+ans);
	}

}
