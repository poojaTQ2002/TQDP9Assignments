package com.LoopAssignment;
//6. Write a Java program to find sum of all even numbers between 1 to n. 
import java.util.Scanner;

public class SumOfAllEvenNum {
	public static void calculateEvenNum(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("Sum of all Even Number between 1 to n is :"+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		calculateEvenNum(num);
			
	}

}
