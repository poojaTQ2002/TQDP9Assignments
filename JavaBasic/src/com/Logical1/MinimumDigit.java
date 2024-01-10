package com.Logical1;

import java.util.Scanner;

public class MinimumDigit {
	public static void minidigit(int num)
	{
		do
		{
			int rem=num%10;
			System.out.println(rem);
			 num=num/10;
			System.out.println(num);
		}while(num!=0);
		int rem;
		if(num>rem)
			System.out.println(num+" is smallest");
		
		
	}
	public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);
	 int num;
	 System.out.println("Enter number :");
	 num=sc.nextInt();
	 minidigit(num);
	
	}

}
