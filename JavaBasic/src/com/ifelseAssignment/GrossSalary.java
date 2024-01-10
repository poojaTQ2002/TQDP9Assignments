package com.ifelseAssignment;

import java.util.Scanner;

public class GrossSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bs;
		double HRA=0,DA=0,Gross;
		System.out.println("Enter Basic Salary :");
		bs=sc.nextInt();
		if(bs<=10000)
		{
			HRA=bs*0.2;
			DA=bs*0.8;
		}
		else if(bs<=20000)
		{
			HRA=bs*0.25;
			DA=bs*0.90;
		}
		else if(bs>20000)
		{
			HRA=bs*0.30;
			DA=bs*0.95;
		}
		Gross=bs+HRA+DA;
		System.out.println("Gross Salary is :"+Gross);
	}

}
