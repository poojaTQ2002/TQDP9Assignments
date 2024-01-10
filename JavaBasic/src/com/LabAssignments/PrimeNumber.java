package com.LabAssignments;

import java.util.Scanner;
public class PrimeNumber
{
 public static boolean checkPrime(int num)
{
    if(num<=1)
    	return false;
    else
    {
    	for(int i=2;i<=num;i++)
    	{
    		if((num%i)==0)
    		{
    			return false;
    		}
    		
    	}
    	return true;
    }
}
 
 public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter starting number :");
	  int num1=sc.nextInt();
	  System.out.println("Enter Ending number :");
	  int num2=sc.nextInt();
	  
	  for(int i=num1;i<=num2;i++)
	 		 if(checkPrime(i))
	 		 {
	 			System.out.println("List of prime number is :"+i);
	 		 }
	 	 
	  }
	
}

