package com.AssignmentsMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EmptyMap
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hmap= new HashMap<>(); 
		 hmap.put(1, "Red");
		 hmap.put(2, "Green");
		 hmap.put(3, "Black");
		 hmap.put(4, "White");
		 hmap.put(5, "Blue");
		 System.out.println(hmap);
		 System.out.println("---------------------------");
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter which key is remmove");
		 int key=sc.nextInt();
		 
		 Iterator<Map.Entry<Integer,String>> itr = hmap.entrySet().iterator();
		 while (itr.hasNext())
		 {
			 Map.Entry<Integer, String> entry= itr.next(); 
		     if(key==entry.getKey())
		     {
		    	 itr.remove(); 
		    	 
		     }
		 
		     
		 }
		 System.out.println("Modified HashMap: "+ hmap);
	}
}
