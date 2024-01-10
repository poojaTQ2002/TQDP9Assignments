package com.IfElse;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		if(n>0)
			System.out.println(n+ "is positive");
		else
			System.out.println(n+ "is nagative");
		System.out.println("End the Program.....");
		}

}
