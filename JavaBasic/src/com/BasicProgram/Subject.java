package com.BasicProgram;

public class Subject {
	public static void main(String args[])
	{
		int sub1=66,sub2=56,sub3=84,sub4=35,sub5=90;
		float total,avg,percentage;
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total is :"+total);
		avg=(total/5);
		System.out.println("Average is :"+avg);
		percentage=((total)/500)*100;
		System.out.println("Percentage is :"+percentage);
		
	}
}
