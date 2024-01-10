package Constructors;

import java.util.Scanner;

	public class checkPrime
	{
		public static boolean prime(int num)
		{
			if(num==0||num==1)
			{
				return false;
			}
			else
			{
				for(int i=2;i<=num;i++)
				{
					if(num%i==0)
					
						return false;
				}
				
			}return true;
		}
		public static void main(String[] args)
		{    
			System.out.println("prime number from 1 to 50");
			for(int i=1;i<50;i++)
			{
				if(prime(i))
					System.out.println(i);
			}
		}
	}
	

