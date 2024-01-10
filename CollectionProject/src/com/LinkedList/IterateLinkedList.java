package com.LinkedList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {
	
	public static void main(String[] args) {
		  LinkedList<String> al= new LinkedList<>();
			
			al.add("Mango");
			al.add("Cherry");
			al.add("Banana");
			al.add("Orange");
			al.add("Kiwi");
			
			ListIterator<String> litr= al.listIterator(al.size());
			while(litr.hasPrevious())
			{
				System.out.println(litr.previous());
			}
			
			System.out.println("-----------------------------------------");
			
			Iterator<String> itr= al.descendingIterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			
			// print
			// normal for loop
			// enhanced for loop
			// iterator
			// list iterator : forward
			// list iterator: backward
			// iterator- descending iterator
	}

}
