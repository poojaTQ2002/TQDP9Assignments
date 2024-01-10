package com.Logical1;

import java.util.Scanner;

public class PowerofNum {
	public static int checkpower(int b,int p)
	{
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result=result*b;
			
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter base and power :");
		int base=sc.nextInt();
		int power=sc.nextInt();
		System.out.println("Answer is :"+checkpower(base,power));
		
	}
	

}
