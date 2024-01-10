package com.ArrayListAssignments;

import java.util.ArrayList;

//22.	WAP of swap two elements in an ArrayList

public class SwapArrayListQ22
{
	static void SwapTwoElements(ArrayList<Integer>ar)
	{
		for(int i=0;i<ar.size();i++)
		{
			for(int j=0;j<ar.size();j++)
			{
				if(ar.get(i)>ar.get(j))
				   {
					   int temp=ar.get(i);
					   ar.set(i,ar.get(j));
					   ar.set(j, temp);
				   }
			}
			
		}
		System.out.println("Afeter Swap :"+ar);	
	}
   public static void main(String[] args) 
   {
	 ArrayList<Integer>list1=new ArrayList();
	 list1.add(21);
	 list1.add(3);
	 list1.add(4);
	 list1.add(55);
	 System.out.println("Befor swap :"+list1);
	 System.out.println("-------------------");
	 SwapTwoElements(list1);
   }
}
