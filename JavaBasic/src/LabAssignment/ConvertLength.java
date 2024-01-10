package LabAssignment;

import java.util.Scanner;

public class ConvertLength {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int length,meter,km,cm;
		System.out.println("Enter Length :");
		length=sc.nextInt();
		meter=length/100;
		System.out.println("meter is :"+meter);
		km=length/1000;
		System.out.println("Kilo meter is :"+km);
		cm=length/10;
		System.out.println("Centimeter is :"+cm);
		
		
	}

}
