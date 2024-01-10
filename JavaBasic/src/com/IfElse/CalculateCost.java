package com.IfElse;

import java.util.Scanner;

public class CalculateCost {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total;
		int cost=100;
		System.out.println("Enter Quantity :");
		int qty=sc.nextInt();
		total=qty*cost;
		if(total>1000)
		{
			total=total-(.1*total);
		}
		System.out.println("Total cost is :"+total);
	}

}
