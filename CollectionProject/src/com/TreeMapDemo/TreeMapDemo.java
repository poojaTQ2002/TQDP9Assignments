package com.TreeMapDemo;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo
{
   public static void main(String[] args)
   {
	 TreeMap<String ,Double>tmap=new TreeMap<>();
	 tmap.put("pooja", 54.25);
	 tmap.put("om", 84.25);
	 tmap.put("reetu", 74.25);
	 tmap.put("anuj", 50.25);
	 
	 NavigableMap<String,Double>ns=tmap.descendingMap();
	 for(Map.Entry<String, Double>e:ns.entrySet())
	 {
		 System.out.println(e.getKey()+"--->"+e.getValue());
	 }
	 
   }
}
