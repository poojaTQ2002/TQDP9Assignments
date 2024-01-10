package com.SwitchCase;

import java.util.Scanner;

public class greatestNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 and num2 :");
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    switch(num1>num2)
		{
			case 1:System.out.println(num1+" is greater number");
			break;
			case 2:System.out.println(num2+" is greater number");
			break;
			default:
				System.out.println("Both are eual...");
		}
	}

}
