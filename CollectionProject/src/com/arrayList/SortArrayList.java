package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList 
{
	static void sortList(ArrayList<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp= list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(78);
		al.add(56);
		al.add(45);
		al.add(56);
		al.add(10);
		al.add(67);
		
		System.out.println("Before:"+al);
		sortList(al);
		
		System.out.println("After:"+al);
		
	}

}
