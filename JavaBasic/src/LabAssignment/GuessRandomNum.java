package LabAssignment;

import java.util.Scanner;

public class GuessRandomNum 
{
  public static void checkRandomNum(int num)
  {  int random,guess;
	while(guess!=random)
	 {
		if(guess>random)
		 {
			 System.out.println("Too high,try again...");
			 
		 }else if(guess<random)
		 {
			 System.out.println("Too low,try again...");
		 }
	 }
		  
  }
  public static void main(String[] args) 
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number :");
	 int num=sc.nextInt();
	 int random=sc.nextInt();
	 checkRandomNum(num);
  }
}
