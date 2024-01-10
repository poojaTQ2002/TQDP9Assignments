package com.StringAssignments2;

public class RemoveExtraSpaceQ18
{
	static void removeAllExtraSpace(String s)
	{
		String str = s.replaceAll("\\s+", "");
		System.out.println("Input String Without Spaces : "+str);
        
	}
	public static void main(String[] args) 
	{
		String s="Java Is Fun";
		System.out.println(s);
		System.out.println("------------");
		removeAllExtraSpace(s);
	}
   
   
}
