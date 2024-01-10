package com.ArrayListAssignments;

import java.util.ArrayList;

public class TrimeSize
{
	 public static void main(String[] args) {
	        // create an ArrayList
	        ArrayList<String> languages = new ArrayList<>();

	        // add element to ArrayList
	        languages.add("Java");
	        languages.add("Python");
	        languages.add("JavaScript");
	        System.out.println("ArrayList: " + languages);
	        System.out.println("----------------------");

	        // trim capacity to 3
	        languages.trimToSize();
	        System.out.println(languages);
	    }
}
