package com.StringAssignments2;

import java.util.Arrays;

//Q7Change the case of the vowels

public class ChangeCaseOfVowelQ7
{
	static void replaceVowelWithSymbol(String s)
	{
		//s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			{
				if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
				{
					ch[i]=Character.toUpperCase(ch1);
				}
				else if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
				{
					ch[i]=Character.toLowerCase(ch1);
				}
			}
		}
		String s1=new String(ch);
		System.out.println("New String :"+s1);
	}
   public static void main(String[] args)
   {
	   String s="JavA is fUn";
	   //char specialSymbol='#';
	   System.out.println("Original String is :"+s);   
	   replaceVowelWithSymbol(s);
	   
   }
}