package com.LinkedListAssignments;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList<String>list1 = new LinkedList<String>();
		list1.add("Java");
		list1.add("C");
		list1.add("Cpp");
		list1.add("Python");
		list1.add("Php");
		list1.add("Css");
		list1.add("Html");
		list1.add("MySql");
		System.out.println("linked list:" + list1);
		Iterator <String>it = list1.descendingIterator();
		System.out.println("Reverse Order:");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}	
	}
	
}

