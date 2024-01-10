package com.ArrayListAssignments;

import java.util.ArrayList;

public class ReplaceSpesificElements
{
	public static void main(String[] args)
	   {
		   ArrayList<String>arr=new ArrayList<>(7);
	   	arr.add("Pooja");
	   	arr.add("Vinayak");
	   	arr.add("Reetu");
	   	arr.add("Omkar");
	   	System.out.println(arr);
	   	arr.set(1, "TQ");
	   	System.out.println(arr);
	   }
}
