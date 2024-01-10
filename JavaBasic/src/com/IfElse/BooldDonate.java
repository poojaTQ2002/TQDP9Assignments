package com.IfElse;

import java.util.Scanner;

public class BooldDonate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Enter your weight :");
			float weight=sc.nextFloat();
			if(weight>=50)
			System.out.println("You can donate the boold");
			else
				System.out.println("You are underweight and cannot donate blood");
		}
		else
			System.out.println("You are too ypung to donate blood");
		
	}

}
