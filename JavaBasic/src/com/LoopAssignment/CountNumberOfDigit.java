package com.LoopAssignment;

import java.util.Scanner;

//8. Write a Java program to count number of digits in any number
public class CountNumberOfDigit {
	public static void countNum(int num)
	{   int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
			
		System.out.println("count number of digits is :"+count);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		countNum(num);
	}

}
