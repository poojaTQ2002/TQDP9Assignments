package com.StringAssignments2;

import java.util.Arrays;

//6.Change the case of all the character  means - JaVa- jAvA

public class ChangeCaseQ6
{
	static void changeCaseAllChar(String s)
	{
		//s=s.toLowerCase();
		int i;
		char ch[]=s.toCharArray();
		
		for( i=0;i<ch.length;i++)
		{
			if(Character.isLowerCase(ch[i]))
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
			else if(Character.isUpperCase(ch[i]))
			{
				ch[i]=Character.toLowerCase(ch[i]);
			}
			
		}
		//change array into string
		String s1=new String(ch);
		System.out.println(ch);
	}
  public static void main(String[] args)
  {
	 String s="JaVa";
	 System.out.println("Orignal String is :"+s);
	 System.out.println("New String : ");
	 changeCaseAllChar(s);
	 
	 
  }
}
