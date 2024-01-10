package com.SwitchCase;

import java.util.Scanner;

public class DaysofWeeks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dayNo;
		System.out.println("Enter number of day :");
		dayNo=sc.nextInt();
		switch(dayNo)
		{
		case 1: System.out.println("Monday");
		        break;
		case 2: System.out.println("Tuesday");
		         break;
		case 3: System.out.println("Wednesday");
		         break;
		case 4: System.out.println("Thursday");
		         break;	        
		case 5: System.out.println("Friday");
		          break;
		case 6: System.out.println("Saturday");
		         break;
		case 7: System.out.println("Sunday");
		         break;
		
		default:System.out.println("Error day does not exit");	
}
}
}
