package Constructors;

import java.util.Scanner;

public class ArmstrongNumber 
{
  public static int checkDigit(int num)
  {
	  int count=0;
	  do 
	  {
		  num=num/10;
		  count++;
	  }while(num!=0);
	  return count;
  }
  public static int checkpower(int num,int pow)
  {
	   pow=1;
	   for(int i=1;i<=pow;i++)
	   {
		   pow=pow*num;
	   }
	   return pow;
  }
  public static boolean checkArmstrong(int num)
  {
	  int original=num;
	  int sum=0;
	  int rem;
	  while(num>0)
	  {
		  rem=num%10;
		  sum=sum+checkpower(rem,checkDigit(num));
	  }
	  if(original==sum)
	  {
		 return true; 
	  }
	  else
	  {
		  return false;
	  }
  }
   public static void main(String args[])
     {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number :");
	    int num=sc.nextInt();
	    if(checkArmstrong(num))
		  {
			 System.out.println("is Armstrong number"); 
		  }
		  else
		  {
			  System.out.println(" is not Armstrong number");
		  }
	 }
}



