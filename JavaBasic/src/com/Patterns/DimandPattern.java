package com.Patterns;

import java.util.Scanner;

public class DimandPattern {
	static void spacePattern() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter rows :");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int sp=1;sp<=rows-i;sp++)//Space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)//column
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=rows-1;i>=1;i--)
		{
			for(int sp=rows-1;sp>=i;sp--)//Space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)//column
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		spacePattern();
		
	}

}
