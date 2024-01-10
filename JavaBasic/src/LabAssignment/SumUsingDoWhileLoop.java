package LabAssignment;

import java.util.Scanner;

public class SumUsingDoWhileLoop 
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    char op;
	    do{
	      System.out.println("Enter two numbers");
	      int num1= sc.nextInt();
	      int num2 = sc.nextInt();
	      sum = sum+num1+num2;
	      System.out.println("Do you wish to perform another operation, Y/N");
	      op =sc.next().charAt(0);
	    }while(op =='Y'||op=='y');
	    System.out.println("sum "+sum);
	  }
}
