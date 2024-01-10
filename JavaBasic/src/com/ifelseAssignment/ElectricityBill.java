package com.ifelseAssignment;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double unit,totalbill,amt=0,surcharge;
		System.out.println("Enter Electricity Unit :");
		unit=sc.nextDouble();
		if(unit<=50)
		{
			amt=unit*0.50;
		}
		else if(unit<=100)
		{
			amt=unit*0.75;
		}
		else if(unit<=150)
		{
			amt=unit*1.25;
		}
		else if(unit<=250)
		{
			amt=unit*1.50;
		}
		surcharge=amt*0.2;
		totalbill=amt+surcharge;
		System.out.println("Total Electricity Bill is :"+totalbill);
		
	}

}
