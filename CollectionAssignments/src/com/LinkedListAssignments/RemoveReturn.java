package com.LinkedListAssignments;

import java.util.LinkedList;
//WAP to remove and return the first element of a linked list.
public class RemoveReturn
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
		list.pop();
		System.out.println(list);
  }
}
