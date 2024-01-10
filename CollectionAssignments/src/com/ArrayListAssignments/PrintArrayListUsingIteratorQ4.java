package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Iterator;

//4.WAP to print all elements of ArrayList using iterator

public class PrintArrayListUsingIteratorQ4 
{
   public static void main(String[] args) 
   {
	 ArrayList<String>ar=new ArrayList<>();
	 ar.add("Apple");
	 ar.add("Banana");
	 ar.add("Orange");
	 
	 Iterator<String>iterator=ar.iterator();
	 while(iterator.hasNext())
		 System.out.println(iterator.next());
   }
}
