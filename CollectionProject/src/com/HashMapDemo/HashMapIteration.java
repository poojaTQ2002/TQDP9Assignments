package com.HashMapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
	
	public static void main(String[] args) {
		
		HashMap<String,Float> hm= new HashMap<>();
		
		hm.put("Reetu", 89.0f);
		hm.put("Pranali", 96.4f);
		hm.put(null, 0f);
		hm.put("Pooja", 56.4f);
		hm.put("Bhaskar", 78.4f);
		
		System.out.println("------------------------------------------");
		
		System.out.println(hm);
		
		System.out.println("------------------------------------------");
		
		Set<String> keys= hm.keySet();
		
		for(String s:keys)
		{

			System.out.println(s+"-->"+hm.get(s));
			
		}
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		Iterator<String> itr= keys.iterator();
		while(itr.hasNext())
		{
			String k= itr.next();
			System.out.println(k+"-->"+hm.get(k));
		}
		
		System.out.println("------------------------------------------");
		
		Collection<Float> marks=hm.values();
		for(Float m:marks)
		{
			System.out.println(m);
		}
		
		System.out.println("------------------------------------------");
		
		Set<Entry<String,Float>> entries=hm.entrySet();
		
		for(Entry<String,Float> en:entries)
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
		System.out.println("------------------------------------------");
		
		for(Map.Entry<String, Float> e: hm.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
	}

}

