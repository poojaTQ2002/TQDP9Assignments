package com.Logical1;

import java.util.Scanner;

public class PerfectSquare {
	public static boolean checkPerfectSquare(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				System.out.println(i+"*"+i+"="+num);
				return true;
			}
		}
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		if(checkPerfectSquare(n))
		System.out.println(n+" is perfect square");
		else
			System.out.println(n+" is not perfect square");
		
		
	}

}
