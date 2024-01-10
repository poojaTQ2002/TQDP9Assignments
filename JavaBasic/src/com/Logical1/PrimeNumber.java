package com.Logical1;

import java.util.Scanner;

public class PrimeNumber {
	public static void checkprime(int num)
	{
		boolean status=true;
		if(num==0||num==1)
			status=false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					status=false;
					break;
				}
			}
		}
		if(status)//status==true
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		checkprime(num);

	}

}
