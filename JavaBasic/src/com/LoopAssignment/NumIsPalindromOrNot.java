package com.LoopAssignment;

import java.util.Scanner;

public class NumIsPalindromOrNot 
{
	public static void checkPalindrom(int num)
	{
		int rem,sum=0,temp;    
		temp=num;    
		while(num>0)    
		{    
		rem=num%10;    
		sum=(sum*10)+rem;    
		num=num/10;    
		}    
		if(temp==sum)
			System.out.println("Number is palindrome number ");    
		else    
			System.out.println("Number is not palindrome number ");   
		 
	}   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");    
		int num=sc.nextInt();
		checkPalindrom(num);
	}
}
