package com.basic;

import java.util.Scanner;

public class AveragewithScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float num1;
		float num2;
		float num3;
		float avg;
		System.out.println("Enter num1 :");
		num1=sc.nextFloat();
		System.out.println("Enter num2 :");
		num2=sc.nextFloat();
		System.out.println("Enter num3 :");
		num3=sc.nextFloat();
		avg=(num1+num2+num3)/3;
		System.out.println("Average is :"+avg);
		
		
		
	}

}
