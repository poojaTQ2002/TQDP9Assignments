package com.SwitchCase;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter any number :");
		num=sc.nextInt();
		switch(num%2)
		{
		case 0:System.out.println(num+" is Even");
		break;
		case 1:System.out.println(num+" is Odd");
		break;
		}
	}

}
