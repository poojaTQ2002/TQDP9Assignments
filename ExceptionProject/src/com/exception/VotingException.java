package com.exception;

import java.util.Scanner;

public class VotingException 
{
   public static void main(String[] args)
   {
	   Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your age :");
				
		try
		{
			int age = sc.nextInt();
			if(age>18)
				System.out.println("Vote");
			else
				System.out.println("Cannot vote");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			sc.close();
			System.out.println("Compulsory code");
		}
		
		System.out.println("Vote Ends:...");

   }
}
