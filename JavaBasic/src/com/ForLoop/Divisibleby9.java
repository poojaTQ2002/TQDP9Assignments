package com.ForLoop;

public class Divisibleby9 {
	public static long printnum()
	{
		int sum=0;
		for(int i=100;i<=200;i++)
		{
			if(i%9==0)
				System.out.println("Number is divisible by 6 is :"+i);
			{
				sum+=i;	
			}
				
		}	
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum is :"+printnum());
	}

}
