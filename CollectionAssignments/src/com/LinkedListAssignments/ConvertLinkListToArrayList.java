package com.LinkedListAssignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//WAP to convert a linked list to array list.
public class ConvertLinkListToArrayList 
{
	public static void main(String[] args) {
	      LinkedList<String> l = new LinkedList<String>();
	      l.add("Orange");
	      l.add("Apple");
	      l.add("Peach");
	      l.add("Guava");
	      l.add("Pear");
	      System.out.println(l);
	      System.out.println("--------------------------");
	      List<String> aList = new ArrayList<String>(l);
	      System.out.println("The ArrayList elements are: ");
	    for (Object i : aList) {
	         System.out.println(i);
	      }
	   }
}
