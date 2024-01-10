package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class EqualArrayList
{
  public static void main(String[] args) 
  {
	  List<String> list1=new ArrayList<String>();  
	  list1.add("Mango");  
	  list1.add("Apple");  
	  list1.add("Banana");  
	  list1.add("Grapes"); 
	  System.out.println(list1);
	  
	  List<String> list2=new ArrayList<String>();  
	  list2.add("Mango");  
	  list2.add("Apple");  
	  list2.add("Banana");  
	  list2.add("Grapes"); 
	  System.out.println(list2);
	  System.out.println("--------------------------");
	  
	  System.out.println(list1.equals(list2));
	  
  }
}
