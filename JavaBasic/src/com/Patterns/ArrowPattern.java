package com.Patterns;

import java.util.Scanner;

public class ArrowPattern {
	static void arrowDemo(){
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter rows :");
		int rows=sc.nextInt();
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}
		for (int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	
	}
	public static void main(String[] args) {
		arrowDemo();
		
	}

}
