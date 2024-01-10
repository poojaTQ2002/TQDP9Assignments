package com.ifelseAssignment;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet :");
		char alpha=sc.next().charAt(0);
		if(alpha=='a'|| alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u')
			System.out.println(alpha+" is a vowel");
		else
			System.out.println(alpha+" is a consonant");
	}

}
