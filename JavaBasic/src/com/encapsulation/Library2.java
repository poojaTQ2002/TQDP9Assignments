package com.encapsulation;

import java.util.Scanner;

public class Library2 
{   static Scanner sc=new Scanner(System.in);

	public static void insertBook(Book b)
	{
		System.out.println("Enter Id :");
		b.setId(sc.nextInt());
		
		System.out.println("Enter Bookname :");
		b.setBname(sc.next());
		
		System.out.println("Enter Price :");
		b.setPrice(sc.nextDouble());
	}
	public static void main(String[] args) 
	{
		Book b1=new Book();
		insertBook(b1);
		
		Book b2=new Book();
		insertBook(b2);
		
		System.out.println(b1);
		System.out.println(b2);
		
		
	}

}
