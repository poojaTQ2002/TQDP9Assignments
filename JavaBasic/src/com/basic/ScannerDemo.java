package com.basic;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name;
		double marks;
		char grade;
		System.out.println("Enter your number :");
		rollno=sc.nextInt();
		System.out.println("Enter your name :");
		name=sc.next();
		System.out.println("Enter marks :");
		marks=sc.nextDouble();
		System.out.println("Enter grade :");
		grade=sc.next().charAt(0);
		System.out.println("rollno:"+rollno+ "Nmae:"+name);
		System.out.println("you have score"+marks+"marks with grade"+grade);
		
		
		
		
	}

}
