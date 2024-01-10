package com.SwitchCase;

import java.util.Scanner;

public class MonthofDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = 0;
		int days;
		System.out.printf("Enter the Month Number : ");
		mon = sc.nextInt();
		switch(mon)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("Number of Days 31..");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("Number of Days 30..");
				break;
			case 2:
				days = 28;
				break;
			default:
				System.out.printf("Invalid...");
				break;
		
			
	}

}
}
