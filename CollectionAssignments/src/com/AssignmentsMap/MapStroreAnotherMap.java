package com.AssignmentsMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapStroreAnotherMap 
{
	public static void main(String a[])
    {
        LinkedHashMap<String, String> lhm= new LinkedHashMap<>();
        lhm.put("Apurva", "Bhatt");
        lhm.put("James", "Bond");
        lhm.put("Scarlett ", "Johansson");

        System.out.println(lhm);
        System.out.println("---------------------------------");
 
        Map<String, String> hmap2 = new HashMap<String, String>();

        for (Map.Entry<String, String> entry : lhm.entrySet())
        	hmap2.put(entry.getKey(), entry.getValue());
 
        System.out.println("Map store Another map :"+hmap2);
    }
}
