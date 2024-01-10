package com.AssignmentsMap;

import java.util.HashMap;

public class CopyAllElements
{
	public static void main(String args[]) 
	{
		HashMap <Integer,String> hash_map1 = new HashMap <> ();
	    HashMap <Integer,String> hash_map2 = new HashMap <> ();
	      hash_map1.put(1, "Red");
		  hash_map1.put(2, "Green");
		  hash_map1.put(3, "Black");
		  System.out.println("Values in first map: " + hash_map1);
		  System.out.println("-------------------------------------");
		  hash_map2.put(4, "Red");
		  hash_map2.put(5, "Blue");
		  hash_map2.put(6, "Orange");
		  System.out.println("Values in second map: " + hash_map2);
		  System.out.println("-------------------------------------");

		  hash_map2.putAll(hash_map1);
		  System.out.println("Now values in second map: " + hash_map2);
		 }
}
