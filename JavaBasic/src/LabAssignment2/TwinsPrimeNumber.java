package LabAssignment2;

import java.util.Scanner;

public class TwinsPrimeNumber 
{
 public static boolean checkPrimeNum(int num)
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
		return status;
 }

 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number :");
	int num1=sc.nextInt();
	System.out.println("Enter 2nd Number :");
	int num2=sc.nextInt();
	if(checkPrimeNum(num1) && checkPrimeNum(num2) && (num2-num1==2))
	{
		System.out.println(num1+" "+num2+" is Twins Prime Number ");
    }else {
		System.out.println("Not Twins Prime Number ");
	}
}
}

