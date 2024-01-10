package com.LinkedListAssignments;

import java.util.LinkedList;

public class LinkedIsEmptyOrNot
{
  public static void main(String[] args)
  {
	  LinkedList<String> l = new LinkedList<String>();
	  
	  System.out.println(l.isEmpty());
	  System.out.println("---------");
      l.add("Orange");
      l.add("Apple");
      l.add("Peach");
      l.add("Guava");
      l.add("Pear");
      
      System.out.println(l.isEmpty());
      
  }
}
