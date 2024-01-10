package com.customexception;

import java.io.IOException;
import java.util.Scanner;

public class NameAccept {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:");
		
		String name= sc.next();
		try
		{
		if(name.length()<3)
			throw new InvalidNameException(" Name must be greater than 2 characters");
		
		System.out.println("Welcome "+name);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
				
	}

}

