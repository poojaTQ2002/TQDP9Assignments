package com.HashMapDemo;

import java.util.HashMap;

public class hashMapDemo 
{
public static void main(String[] args) {
		
		HashMap<String,String> hmap= new HashMap<>();
		
		System.out.println(hmap.isEmpty());
		hmap.put("India", "+91");
		hmap.put("USA", "+1");
		hmap.put("UAE", "+971");
		hmap.put("Germany", "+49");
		// put() - return null if the key is not present
		
		System.out.println(hmap.put(null, "+0"));
		
		// put() - return the old value of the key and replaces with new value
		
		System.out.println(hmap.put(null, "+100")); // replaces with new value
		hmap.put("South Korea", null);
		hmap.put("Italy", null);
		
		System.out.println(hmap);

		System.out.println("Size:"+hmap.size());
		
		// get
		System.out.println("----------------------------------------");
		System.out.println(hmap.get("USA"));
		
		System.out.println(hmap.containsKey("Spain"));
		System.out.println(hmap.containsValue("+49"));
		
		System.out.println("----------------------------------------");
		
		// putIf Absent
		// return null if old value is null and replaced by new value
		// return same value if not null
		
		// only add the value if it is null
		System.out.println(hmap.putIfAbsent("Italy", "+39"));
		System.out.println(hmap);
		
		System.out.println(hmap.putIfAbsent("Italy", "+31"));
		System.out.println(hmap);
		
		hmap.clear();
		System.out.println(hmap);
		/*
		 * 1. Using equals() method, it checks that key is null or not.
       If the key is null and it directly place value to 0th index, it will returns null.
       If the key is already present  then it will replace the value and returns the old value.
	 
    2. If the key is not null then it will call putVal(), which has five parameters.
	   
	3. check if value is present or not if not present then it will return null and place value at that index.
	
    4. If the value is present on that index then it will call equals() method and compares key. 
  	   if key is same then it replaces the value and returns the old value.
	   
	5. If the key is not equal then new pair of key value gets added at the end, at the same index.
		 */
		
	}

}
