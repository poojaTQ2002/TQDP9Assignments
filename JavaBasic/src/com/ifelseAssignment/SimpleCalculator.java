package com.ifelseAssignment;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,ans = 0;
		System.out.println("Enter num1 and num2 :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Choose the operant (+,-,*,/,%) :");
		char op=sc.next().charAt(0);
		if(op=='+')
		{
			ans=num1+num2;
		}
		else if(op=='-')
		{
			ans=num1-num2;
		}
		else if(op=='*')
		{
			ans=num1*num2;
		}
		else if(op=='/')
		{
			ans=num1/num2;
		}
		else if(op=='%')
		{
			ans=num1%num2;
		}
		System.out.println("Answer is :"+ans);
		
		
	}

}
