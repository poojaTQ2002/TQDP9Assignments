package com.IfElse;

import java.util.Scanner;

public class Charactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Chractor:");
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println(ch+" is charactor");
		else if((ch>='0' && ch<='9'))
			System.out.println(ch+" is number");
		sc.close();
	}

}
