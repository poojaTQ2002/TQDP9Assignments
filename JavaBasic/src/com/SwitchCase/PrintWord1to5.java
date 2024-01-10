package com.SwitchCase;

import java.util.Scanner;

public class PrintWord1to5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dayNo;
		System.out.println("Enter number :");
		dayNo=sc.nextInt();
		switch(dayNo)
		{
		case 1: System.out.println("One");
		        break;
		case 2: System.out.println("Two");
		         break;
		case 3: System.out.println("Three");
		         break;
		case 4: System.out.println("Four");
		         break;	
		case 5: System.out.println("Five"); 
		         break;
		default:System.out.println("Error....");
	}

}
}
