package com.AssignmentsMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GetAllEntries
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hmap= new HashMap<>(); 
		 hmap.put(1, "Red");
		 hmap.put(2, "Green");
		 hmap.put(3, "Black");
		 hmap.put(4, "White");
		 hmap.put(5, "Blue");
		 hmap.put(6, "Pink");
		 Set<Integer> keys= hmap.keySet();
		 Iterator<Integer> itr= keys.iterator();
			while(itr.hasNext())
			{
		       Integer k= itr.next();
		       System.out.println(k+"-->"+hmap.get(k));
			}
	}
	
}
       