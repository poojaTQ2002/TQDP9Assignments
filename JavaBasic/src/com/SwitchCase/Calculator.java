package com.SwitchCase;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char operator;
		int num1,num2,result;
		System.out.println("Choose any Operator :");
		operator=sc.next().charAt(0);
		System.out.println("Enter num1 and num2 :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		switch(operator)
		{
		case '+':
			result=num1+num2;
			System.out.println(num1+"+"+num2+"="+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+"="+result);
			break;
		case '*':
				result=num1*num2;
				System.out.println(num1+"*"+num2+"="+result);
				break;
		case '/':
				result=num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
				break;
		case '%':
				result=num1%num2;
				System.out.println(num1+"%"+num2+"="+result);
				break;
				default:
					System.out.println("Invalid Operator....");
			
			
		       
		}
	}

}
