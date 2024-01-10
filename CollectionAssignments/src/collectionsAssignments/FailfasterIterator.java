package collectionsAssignments;

import java.util.ArrayList;
import java.util.Iterator;

public class FailfasterIterator 
{
	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<>(5);
		
		al.add("Kiwi");
		al.add("Oranges");
		al.add("Banana");
		al.add("Apple");
		al.add("Cherries");
		
		System.out.println(al);
		
		Iterator< String> itr= al.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("Apple"))
			{
				al.add("Pineapple"); // throws ConcurrentModification
				
			}
				
		}
		
		System.out.println(al);
	}

}
