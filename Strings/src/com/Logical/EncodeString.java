package com.Logical;

public class EncodeString
{
	static void replaceVowels(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e' ||c[i]=='u'||c[i]=='i'|| c[i]=='o'||c[i]=='E' ||c[i]=='A'||c[i]=='U' ||c[i]=='I'||c[i]=='O')
			{
				c[i]='#';
			}
		}
		System.out.println(c);
	}
   public static void main(String[] args) 
   {
	String st="Education";
	System.out.println(st);
	replaceVowels(st);
   }
}
