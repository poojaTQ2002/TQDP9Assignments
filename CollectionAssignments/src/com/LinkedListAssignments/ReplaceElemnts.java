package com.LinkedListAssignments;

import java.util.LinkedList;

public class ReplaceElemnts
{
  public static void main(String[] args) 
  {
    LinkedList<String> l = new LinkedList<String>();
	
      l.add("Orange");
      l.add("Apple");
      l.add("Peach");
      l.add("Guava");
      l.add("Pear");
      System.out.println(l);
      System.out.println("--------------");
      l.replaceAll(null);
      System.out.println(l);
  }
}
