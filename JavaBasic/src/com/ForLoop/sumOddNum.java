package com.ForLoop;

public class sumOddNum {
	public static int sumOdd()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum of Odd number is :"+sumOdd());
	}

}
