package com.Logic;

import java.util.Arrays;

public class SumOfPrimeNumber
{
	static void sumPrime(int ar[])
	{
	int i,count, sum = 0;  
  
	for( i = 1; i <= ar.length; i++)  
	{  
	count = 0;  
	for ( i = 2; i <= ar.length/2; i++)  
	{  
	  
	if(ar[i] % i == 0)  
	{  
	
	count++;  
	break;  
	}  
	}  
	if(count == 0 && i != 1 )  
	{  
	    
	sum = sum + ar[i];  
	}    
	}  
	System.out.println(sum);  
   }
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(ar));
		System.out.println("Sum is ");
		sumPrime(ar);
    }
}
