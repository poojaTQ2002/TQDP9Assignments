package com.Lab;

public class NamePattern 
{
	static void printPattern(String s)
	{
		String s1="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			s1=s1+s.charAt(i);
			System.out.println(s1);
		}
		
	}
	//2nd way
	static void createPattern(String s)
	{
		//String s1="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(s.substring(0,i+1));
		}

	}
   public static void main(String[] args)
   {
	   String str="Hello";
	   printPattern(str);
	   System.out.println("---------------");
	   createPattern(str);
	
   } 
}
