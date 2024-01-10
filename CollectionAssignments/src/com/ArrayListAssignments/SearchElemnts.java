package com.ArrayListAssignments;

import java.util.ArrayList;
//14.	WAP to search an element from ArrayList
public class SearchElemnts
{
   public static void main(String[] args)
   {
	   ArrayList<Integer>arr=new ArrayList();
	   
		arr.add(55);
		arr.add(40);
		arr.add(18);
		arr.add(54);
		
		System.out.println(arr.indexOf(18));
   }
}
