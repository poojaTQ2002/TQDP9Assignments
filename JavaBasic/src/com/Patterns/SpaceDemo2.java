package com.Patterns;

import java.util.Scanner;

public class SpaceDemo2 {
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
