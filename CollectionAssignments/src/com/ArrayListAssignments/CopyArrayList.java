package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList
{
   public static void main(String[] args) 
    {
	   List<String> list1=new ArrayList<String>();  
		  list1.add("Mango");  
		  list1.add("Apple");  
		  list1.add("Banana");  
		  list1.add("Grapes"); 
		  System.out.println(list1);
		  System.out.println("--------------------");
		  
		  List<String> list2=new ArrayList<String>();  
		  list2.add("21");  
		  list2.add("11");  
		  list2.add("51");  
		  list2.add("1");  
		  System.out.println(list2);
		  System.out.println("---------------------");
		  
		  Collections.copy(list1, list2);
		  System.out.println(list1);
		  System.out.println(list2);
		  
    }
}
