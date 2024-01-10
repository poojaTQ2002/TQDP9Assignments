package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//7.WAP to create a new ArrayList, add some colors (string) and print the collection.
public class PrintCollectionQ7
{
	public static void main(String[] args)
	{
		String []colors= {"Red","Pink","Black"};
		System.out.println(Arrays.toString(colors));
		System.out.println("----------------------------------");
		
		// 1st way
		  List<String> l1=Arrays.asList(colors);
		  System.out.println(l1);
		  System.out.println("-------------------------");
		  
        // 2nd way
		  
		  ArrayList<String> al= new ArrayList<>(Arrays.asList(colors));
		  System.out.println(al);
		  
		  System.out.println("----------------------------------");
		  
		  // 3rd way
		  
		  ArrayList<String> al2= new ArrayList<>();
		  Collections.addAll(al2,colors);
		  
		  System.out.println(al2);
		  
		
	}

}
