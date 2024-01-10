package LabAssignment;

import java.util.Scanner;

public class SumPositiveNegativeAndZero
{
	public static void countNum(int num)
	{    int countP=0, countN=0, countZ=0;
	      
	         if(num<0)
	         {
	            countN++;
	         }else if(num>0)
	         {
	            countP++;
	         }else {
	            countZ++;
	         }
	      
	      
	      System.out.println("Total Positive Number: " +countP);
	      System.out.println("Total Negative Number: " +countN);
	      System.out.println("Total Zero: " +countZ);
	}
	 public static void main(String[] args)
	   {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter Numbers: ");
	      int num=sc.nextInt();
	      countNum(num);
	      
	   }
}
