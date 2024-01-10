package com.Logical1;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkpalindrome(int num)
	{
		int original=num;
		int rev=0;
		do
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}while(num!=0);
		if(original==rev)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		if(checkpalindrome(num))
		System.out.println(num+" is palindrom number");
		else
			System.out.println(num+" is not palindrom");
			
		
	}

}
