package LabAssignment2;

import java.util.Scanner;

public class StrongNumber 
{
  public static long checkfactorial(int num)
  {
	  long fact=1;
	   num=0;
	  for(int i=1;i<=num;i++)
		  fact*=i;
	   return fact;
	  
  }
  public static void checkStrongNumber(int no)
  {
	  int original=no;
	  long sum=0;
	  do
	  {
		  int rem=no%10;
		  sum=sum+checkfactorial(rem);
		  no/=10;
	  }while(no!=0);
	  if(original==sum)
		  System.out.println(original+" is Strong Number");
	  else
		  System.out.println(original+" is Not Strong Number");
	}
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number :");
	int num=sc.nextInt();
	checkStrongNumber(num);
  }
}
