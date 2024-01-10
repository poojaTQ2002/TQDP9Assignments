package LabAssignment;

import java.util.Scanner;

public class SwapNum2 {
	public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	int num1,num2;
	System.out.println("Enter num1 and num2 :");
	num1=sc.nextInt();
	num2=sc.nextInt();
	System.out.println("Before swap number :"+"num1="+num1+" num2="+num2);
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("After swap number :"+"num1="+num1+" num2="+num2);
	

}
}
