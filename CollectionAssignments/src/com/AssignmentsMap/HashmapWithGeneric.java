package com.AssignmentsMap;

import java.util.HashMap;
import java.util.Map;

public class HashmapWithGeneric
{
   public static void main(String[] args)
   {
	 HashMap <Integer,String> hmap=new HashMap<>();
	 hmap.put(101, "Soham");
	 hmap.put(102, "Amruta");
	 hmap.put(103, "Kavya");
	 hmap.put(104, "Ajit");
	 
	 for(Map.Entry<Integer,String> e: hmap.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
   }
}
