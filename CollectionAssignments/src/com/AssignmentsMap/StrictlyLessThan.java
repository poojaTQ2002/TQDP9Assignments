package com.AssignmentsMap;

import java.util.HashMap;

public class StrictlyLessThan
{
	public static void main(String args[]) {

		  // Create a tree map
		  HashMap < Integer, String > hmap = new HashMap < Integer, String > ();

		  // Put elements to the map 
		  hmap.put(10, "Red");
		  hmap.put(20, "Green");
		  hmap.put(40, "Black");
		  hmap.put(50, "White");
		  hmap.put(60, "Pink");

		  System.out.println("Orginal hmap content: " + hmap);
		  System.out.println(hmap);
		 }
}
