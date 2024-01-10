package com.ArrayListAssignments;

import java.util.ArrayList;

public class JointArrayList 
{
	public static void main(String[] args) {
	      ArrayList<String> join1 = new ArrayList<String>();
	      join1.add("Way");
	      join1.add("Two");
	      join1.add("Class");
	      System.out.println("ArrayList 1: " + join1);

	      ArrayList<String> join2 = new ArrayList<String>();
	      join2.add("Education ");
	      join2.add("comes");
	      join2.add("first");
	      System.out.println("ArrayList 2: " + join2);

	      join1.addAll(join2);

	      System.out.println("Joined ArrayList: " + join1);
	   }
}
