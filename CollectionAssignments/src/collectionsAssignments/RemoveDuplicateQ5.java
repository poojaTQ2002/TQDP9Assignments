package collectionsAssignments;
/*5. Create arraylist of characters. Remove duplicate characters from 
the list. E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’} 
6. Output should be {‘d’ , ‘g’ , ‘h’} */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateQ5
{
	static void removeDuplicate(ArrayList<Character> list)
	{
		boolean status=false;
		String s="";
		for(int i=0;i<list.size();i++)
		{
			status=false;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					status=true;
					continue;
				}
			}
			if(status==false)
			{
				s=s+list.get(i);
			}
		}
		System.out.print("After Remove Duplicate :"+" "+s);
	}
   public static void main(String[] args)
   {
	 ArrayList<Character> list=new ArrayList();
	 list.add('d');
	 list.add('g');
	 list.add('h');
	 list.add('d');
	 list.add('d');
	 list.add('h');
	 list.add('g');
	 System.out.println("Origanal list :"+list);
	 removeDuplicate(list);
   }
}
