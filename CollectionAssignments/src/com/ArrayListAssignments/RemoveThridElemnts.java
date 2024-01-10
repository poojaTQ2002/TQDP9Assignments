package com.ArrayListAssignments;

import java.util.ArrayList;

public class RemoveThridElemnts
{
	public static void main(String[] args)
	   {
		   ArrayList<String> list1=new ArrayList<String>();  
			  list1.add("Mango");  
			  list1.add("Apple");  
			  list1.add("Banana");  
			  list1.add("Grapes"); 
			  System.out.println(list1);
			  System.out.println("----------------");
			  list1.remove(3);
			  System.out.println(list1);
	   }
}
