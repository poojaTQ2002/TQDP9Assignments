package com.IfElse;

import java.util.Scanner;

public class BiggestNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2)
			System.out.println("num1 is biggest number");
		else
			System.out.println("num2 is biggest number");
		}

}
