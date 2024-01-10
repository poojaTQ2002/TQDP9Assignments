package com.Logical;

public class StringArrayComparison 
{
	static void uniqueString(String s1[],String s2[])
	{
		boolean found;
		for(String s:s2)
		{
			found=false;
			for(String st:s1)
			{
				if(s.equals(st))
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(s);
			}
		}
	}
   public static void main(String[] args) 
   {
	   String ar1[]= {"Joyti","Reetu","Prachi","Pranay"};
	   String ar2[]= {"Nisha","Reetu","Prachi","Pooja","Vikas"};
	   uniqueString(ar1,ar2);
   }
}
