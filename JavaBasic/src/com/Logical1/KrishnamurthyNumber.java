package com.Logical1;

import java.util.Scanner;

public class KrishnamurthyNumber {
	public static long calculatFactorial(int n)
	{
		long fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
	public static void checkKrishnamurthy(int no)
	{
		int original=no;
		long sum=0;
		do 
		{
			int rem=no%10;
			sum=sum+calculatFactorial(rem);
			no/=10;
		}while(no!=0);
		if(original==sum)
			System.out.println(original+" is a Krishnamurthy number");
		else
			System.out.println(original+" is a not Krishnamurthy number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		checkKrishnamurthy(num);
		
		}

}
