package com.LinkedListAssignments;

import java.util.LinkedList;
//WAP to check if a particular element exists in a linked list
public class CheckPerticularElementsInExist 
{
  public static void main(String[] args)
  {
	  LinkedList <String> c1 = new LinkedList <String> ();
      c1.add("Red");
      c1.add("Green");
      c1.add("Black");
      c1.add("White");
      c1.add("Pink");
      System.out.println(c1);
      if (c1.contains("Hgf"))
      {
         System.out.println("Present in the linked list.");
      } else
      {
           System.out.println("Not present in the linked list.");
      }
  }
}
