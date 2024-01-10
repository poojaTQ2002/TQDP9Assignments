package com.AssignmentsMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CrateMapWithArrayList
{
  public static void main(String[] args)
  {
	ArrayList<String>aList=new ArrayList<>();
	aList.add("Pen");
	aList.add("Pencil");
	aList.add("Books");
	
	ArrayList<String>aList2=new ArrayList<>();
	aList2.add("Notebook");
	aList2.add("Pad");
	aList2.add("Guide");
	
	HashMap<Integer,ArrayList<String>>hmap=new HashMap<>();
	hmap.put(1, aList);
	hmap.put(2, aList2);
	
	for(Map.Entry<Integer,ArrayList<String>> e: hmap.entrySet())
	{
		System.out.println(e.getKey()+"-->"+e.getValue());
	}
  }
}
