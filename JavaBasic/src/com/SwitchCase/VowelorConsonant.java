package com.SwitchCase;

import java.util.Scanner;

public class VowelorConsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char alpha;
		System.out.println("Enter alphabet :");
		alpha=sc.next().charAt(0);
		switch(alpha)
		{
		case 'a':
		case 'o':
		case 'i':
		case 'u':
		case 'e':
			System.out.println(alpha+" is Vowel");
		break;
		default:
            System.out.println(alpha +" is consonant");
		}
	}

}
