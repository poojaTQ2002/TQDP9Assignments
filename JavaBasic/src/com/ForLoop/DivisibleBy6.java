package com.ForLoop;

public class DivisibleBy6 {
	public static long divisiblenum()
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%6==0)
				System.out.println("Number is divisible by 6 is :"+i);
			{
				count+=i;	
			}
				
		}	
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Count is :"+divisiblenum());
		
	}

}
