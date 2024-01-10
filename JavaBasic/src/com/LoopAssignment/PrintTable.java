package com.LoopAssignment;

import java.util.Scanner;

public class PrintTable 
{
	public static void table(int num)
	{
		for(int i=1;i<=10;i++)
			System.out.println(num+"*"+i+"="+num*i);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number :");
		int num=sc.nextInt();
		table(num);
		
	}

}
