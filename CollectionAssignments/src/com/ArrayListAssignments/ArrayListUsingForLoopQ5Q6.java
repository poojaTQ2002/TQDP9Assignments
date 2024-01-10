package com.ArrayListAssignments;

import java.util.ArrayList;

//5.WAP to iterate through all elements in an ArrayList using for loop
//6.WAP to iterate through all elements in an ArrayList using for each
public class ArrayListUsingForLoopQ5Q6
{
  public static void main(String[] args) 
  {
	ArrayList<Integer>arr=new ArrayList();
	arr.add(55);
	arr.add(40);
	arr.add(18);
	
	for(int i=0;i<arr.size();i++)
	{
		System.out.println(arr.get(i));
	}
	System.out.println("--------------------------");
	
	for(Integer int1:arr)
		System.out.println(int1);
  }
}
