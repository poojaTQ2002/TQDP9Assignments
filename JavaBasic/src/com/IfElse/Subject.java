package com.IfElse;

import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double percentage,total;
		String name;
	    System.out.println("Enter name of student :");
	    name=sc.next();
		System.out.println("Enter 5 subject :");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		int sub4=sc.nextInt();
		int sub5=sc.nextInt();
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("total is :"+total);
		percentage=((total/500)*100);
		System.out.println("Percentage is :"+percentage);
		if(percentage>=40)
			System.out.println(name+" has cleared the exam with "+percentage);
		else
			System.out.println(name+" has failed the exam with "+percentage);
		
		

	}

}
