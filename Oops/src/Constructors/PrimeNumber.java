package Constructors;

import java.util.Scanner;

class Number
{
	int i;
	Number()
	{
	
	}
	public void checkPrime(int num)
	{
		
		boolean status=true;
		if(num==0||num==1)
			status=false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					status=false;
					break;
				}
			}
		}
		if(status)//status==true
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
		
	
	}
}

public class PrimeNumber
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Number :");
	  int num=sc.nextInt();
	Number n1=new Number();
	n1.checkPrime(num);
			
  }
}

