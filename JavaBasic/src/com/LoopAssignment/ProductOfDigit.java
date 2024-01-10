package com.LoopAssignment;
//9. Write a Java program to calculate product of digits of any number.
import java.util.Scanner;

public class ProductOfDigit {
	public static void productDigit(int num)
	{   int product=1;
	    while(num>0)
	    {
        int digit = num%10;
        product*=digit;
        num/=10;
		}
			
		System.out.println("Product of digits is :"+product);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		productDigit(num);

   }
}
