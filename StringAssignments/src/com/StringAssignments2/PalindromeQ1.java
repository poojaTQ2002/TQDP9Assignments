package com.StringAssignments2;
//1. Check string in palindrome

public class PalindromeQ1
{
	static  String reversePalindrom(String s)
	{
		
		String revstr="";
		char ch[]=s.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			revstr=revstr+s.charAt(j);
		}
		return revstr;
		
	}
	static boolean checkPalindrom(String str)
	{
		boolean status=true;
		if(!str.equals(reversePalindrom(str)))
		{
			return false;
		}
		return status;
	}
  public static void main(String[] args) 
  {
	  String s="pooja";
	  if(checkPalindrom(s))
	  {
		  System.out.println(s+ " is palindrom");
	  }
	  else
	  {
		  System.out.println(s+ " is not palindrom");
	  }
  }
}
