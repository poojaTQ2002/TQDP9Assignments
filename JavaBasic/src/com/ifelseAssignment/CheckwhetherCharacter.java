package com.ifelseAssignment;

import java.util.Scanner;

public class CheckwhetherCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter any charater :");
		ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println(ch+" is alphabet");
		else if(ch>='0' && ch<='9')
			System.out.println(ch+" is digit");
		else
			System.out.println(ch+" is special character");
		
	}

}
