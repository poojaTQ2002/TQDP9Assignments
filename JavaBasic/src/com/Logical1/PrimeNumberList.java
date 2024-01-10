package com.Logical1;

import java.util.Scanner;

public class PrimeNumberList {
	public static void primenum(int num)
	{
		boolean status=true;
		if(num==0||num==1)
			status=false;
		for(int i=2;i<=50;i++)
		{
			if(num%i==0)
				status=false;
			break;
				
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Prime num between 1 to 50 is:"+num);
		primenum(num);
	}
	

}
