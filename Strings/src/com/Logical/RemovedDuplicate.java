package com.Logical;

public class RemovedDuplicate 
{
	static String removeDup(String s)
	{
		String str="";
		boolean found;
		for(int i=0;i<s.length();i++)
		{
			found=false;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					found=true;
					break;
				}
			}
			if(found==false)
			{
				str=str+s.charAt(i);
			}
		}
		return str;
	}
   public static void main(String[] args)
   {
	  String s="Book";
	  System.out.println("Original :"+s);
	  System.out.println("New :"+ removeDup(s));
	
   }
}
