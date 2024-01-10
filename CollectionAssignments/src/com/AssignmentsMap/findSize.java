package com.AssignmentsMap;

import java.util.HashMap;

public class findSize
{
	 public static void main(String args[])
	 {
		 HashMap<Integer,String> hmap= new HashMap<>(); 
		 hmap.put(1, "Red");
		 hmap.put(2, "Green");
		 hmap.put(3, "Black");
		 hmap.put(4, "White");
		 hmap.put(5, "Blue");
		 hmap.put(6, "Pink");
		 System.out.println("Size of the hash map: "+hmap.size());
	 }
		  
}
