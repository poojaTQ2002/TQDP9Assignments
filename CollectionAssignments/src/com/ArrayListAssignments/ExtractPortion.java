package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractPortion 
{
	public static void main (String[] args)
	{
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("Original list: " + list_Strings);
		  List<String> sub_List = list_Strings.subList(1, 4);
		  System.out.println("List of first three elements: " + sub_List);
	   }

}
