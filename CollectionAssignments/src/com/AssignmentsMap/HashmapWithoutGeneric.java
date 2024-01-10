package com.AssignmentsMap;

import java.util.HashMap;

public class HashmapWithoutGeneric
{
   public static void main(String[] args)
   {
	 HashMap hmap=new HashMap();
	 hmap.put(1, "pooja");
	 hmap.put(2, "nisha");
	 hmap.put(3, "reva");
	 
	 System.out.println(hmap);
	 System.out.println("-------------------------------");
	 HashMap hmap2=new HashMap();
	 hmap2.put("monoj",10);
	 hmap2.put("monika",20);
	 hmap2.put("om",30);
	 System.out.println(hmap2);
   }
}
