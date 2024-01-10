package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArray
{
   public static void main(String[] args)
   {
	  ArrayList<Integer>al=new ArrayList<>();
	  al.add(1);
	  al.add(2);
	  al.add(3);
	  al.add(4);
	  al.add(5);
	  al.add(6);
	  al.add(7);
	  al.add(8);
	  al.add(9);
	  al.add(10);
	  System.out.print(al);
	  
	  ListIterator<Integer> litr1= al.listIterator(al.size());
		
		while(litr1.hasPrevious())
		{
			System.out.print(litr1.previous()+" ");
		}
   }
}
