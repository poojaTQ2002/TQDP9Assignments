package com.arrayList;

import java.util.ArrayList;

public class MethodArrayList
{

	public static void main(String[] args) {
		
		  ArrayList<String> al= new ArrayList<>();
			
		  System.out.println(al.isEmpty());
			al.add("Kiwi");
			al.add("Oranges");
			al.add("Banana");
			al.add("Apple");
			al.add("Cherries");
			al.add(null);
			al.add("Apple");
			
			System.out.println(al);
			
			System.out.println(al.isEmpty());
			
			System.out.println("----------------------------------");
			
			al.add(2, "Pineapple"); // shifting 
			
			System.out.println(al);
			System.out.println("----------------------------------");
			
			al.set(2, "Watermelon");
			System.out.println(al); // value change
			
			System.out.println("----------------------------------");
			
			System.out.println(al.remove(2));

			System.out.println("----------------------------------");
			
			System.out.println(al.remove("Banana"));
			System.out.println("----------------------------------");
			
			ArrayList<String> al2= new ArrayList<>();
			al2.add("Strawberry");
			al2.add("Banana");
			System.out.println(al);
			System.out.println(al2);
			
			System.out.println("----------------------------------");
			
//			al.addAll(al2);
//			System.out.println(al);
			
			System.out.println("----------------------------------");
			
			al.addAll(2,al2);
			System.out.println(al);
			
			//System.out.println("----------------------------------");
			
			//System.out.println(al.contains("Banana"));
			//System.out.println(al2.contains("Kiwi"));
			
			//System.out.println("----------------------------------");
			
			al.retainAll(al2); // keeps only elements from al2 and removes rest
			System.out.println("Retain all :"+al); 

			System.out.println("----------------------------------");
			al.removeAll(al2); // remove all al2 elements
			System.out.println(al); 
			
			System.out.println("----------------------------------");
			
			System.out.println(al.size());
			
	}

}
