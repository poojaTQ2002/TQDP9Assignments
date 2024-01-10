package com.arrayList;

import java.util.ArrayList;

public class FequencyArrayList
{
 
	  static void findFrequency(ArrayList<String> list)
		{
			int count;
			for(int i=0;i<list.size();i++)
			{
				count=1;
				if(list.get(i).equals("Visited"))
					continue;
				for(int j=i+1;j<list.size();j++)
				{
					if(list.get(i).equals(list.get(j)))
					{
						count++;
						list.set(j, "Visited");
						
					}
				}
				System.out.println(list.get(i)+"->"+count);
			}
			
		}

		
		public static void main(String[] args)
		{
			
			ArrayList<String> al = new ArrayList<>();
			al.add("A");
			al.add("B");
	        al.add("C");
	        al.add("A");
	        al.add("A");
	        al.add("B");
	        
	        findFrequency(al);
	        
			
		}

  
}
