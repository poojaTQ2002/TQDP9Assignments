package com.setdemo;

import java.util.Iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		// no access order
		
		LinkedHashSet<String> hs= new LinkedHashSet<>();
				
		hs.add("Chocolates");
		hs.add("Chips");
		hs.add("Juice");
		hs.add(null);
		hs.add("Cold Drink");
		System.out.println(hs.add("Chips"));
		
		System.out.println(hs);
			

		System.out.println("---------------------------------");
		
		for(String s: hs)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
		
		
		Iterator<String> itr= hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		
	}

}
