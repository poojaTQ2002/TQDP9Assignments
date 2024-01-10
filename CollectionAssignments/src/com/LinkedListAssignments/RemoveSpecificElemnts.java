package com.LinkedListAssignments;

import java.util.LinkedList;

public class RemoveSpecificElemnts 
{
	public static void main(String[] args) 
	{
		LinkedList <String>list = new LinkedList <String> ();
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		System.out.println(list);
		
		list.remove("Pink");
		
		System.out.println( list);
	}
}
