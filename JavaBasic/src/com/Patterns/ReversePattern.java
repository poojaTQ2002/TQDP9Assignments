package com.Patterns;

import java.util.Scanner;

public class ReversePattern {
	static void spacePattern() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter rows :");
		int rows=sc.nextInt();
		for(int i=rows;i>=1;i--)
		{
			for(int sp=1;sp<=rows-i;sp++)//Space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//column
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
