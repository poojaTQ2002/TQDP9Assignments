package com.Logical1;

import java.util.Scanner;

public class PrimeNumber3 {
	public static boolean checkprime(int num)
	{
		if(num==0||num==1)
			return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
				return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		if(checkprime(num))
		System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");

	}

}
