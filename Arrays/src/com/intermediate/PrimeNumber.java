package com.intermediate;

import java.util.Arrays;

public class PrimeNumber
{
	public static boolean checkPrime(int num)
	{
		if(num==0||num==1)
			return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,13,24,17,19,21};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Prime numbers in array are:");
		
		for(int i=0;i<arr.length;i++)
		{
			if(checkPrime(arr[i]))
				System.out.println(arr[i]);
				
		}
		
		
		//  Sum of prime numbers
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(checkPrime(arr[i]))
				sum+=arr[i];
				
		}
		
		System.out.println("Sum of prime numbers is "+sum);
	}

}



