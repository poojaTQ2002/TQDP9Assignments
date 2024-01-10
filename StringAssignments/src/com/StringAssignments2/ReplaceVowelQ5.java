package com.StringAssignments2;
//5. replace all the vowels with special symbol
public class ReplaceVowelQ5 
{
	static void replaceVowelWithSymbol(String s,char specialSymbol)
	{
		//s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			{
				if(ch1=='a'||ch1=='o'||ch1=='e'||ch1=='i'||ch1=='u')
				{
					ch[i]=specialSymbol;
				}
			}
		}
		String s1=new String(ch);
		System.out.println("New String :"+s1);
	}
   public static void main(String[] args)
   {
	   String s="Java is Fun";
	   char specialSymbol='#';
	   System.out.println("Original String is :"+s);   
	   replaceVowelWithSymbol(s, '#');
	   
   }
}
