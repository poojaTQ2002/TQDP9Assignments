package com.ifelseAssignment;

import java.util.Scanner;

public class Divisibleby5and11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number :");
		num=sc.nextInt();
		if((num%5==0) && (num%11==0))
			System.out.println(num+" is divisible by 5 and 11");
		else
			System.out.println(num+" is not divisible by 5 and 11");
	}

}
