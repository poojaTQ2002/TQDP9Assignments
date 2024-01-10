package com.AssignmentsMap;

import java.util.HashMap;

public class RemoveElements
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hmap= new HashMap<>(); 
		 hmap.put(1, "Red");
		 hmap.put(2, "Green");
		 hmap.put(3, "Black");
		 hmap.put(4, "White");
		 hmap.put(5, "Blue");
		
		 System.out.println( hmap.remove(4));
		 System.out.println(hmap);
	}
}