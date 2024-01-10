package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList
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
		  list1.set(2, "Cherry");
		  System.out.println(list1);
   }
}
