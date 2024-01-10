package com.LinkedListAssignments;

import java.util.LinkedList;
//	WAP to retrieve but does not remove, the first element of a linked list.
public class RetriveButNotRemoveFiratElements
{
	public static void main(String[] args)
	  {
		  LinkedList <String>list = new LinkedList <String> ();
	      
			list.add("Mukul");
			list.add("Rahul");
			list.add("Suraj");
			list.add("Mayank");
			System.out.println(list);
			System.out.println("----------------------");
			list.peekFirst();
			System.out.println(list);
	  }
}
