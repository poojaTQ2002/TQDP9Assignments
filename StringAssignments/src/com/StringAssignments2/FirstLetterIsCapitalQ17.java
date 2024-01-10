package com.StringAssignments2;
//17. Replace the first letter of every word with capital =I love my india : I Love My India



public class FirstLetterIsCapitalQ17 
{
	static void ReplacefirstletterCapital(String s)
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			char ch=str[i].charAt(0);
			//1st way
			String s1=String.valueOf(ch).toUpperCase();
			String substring=str[i].substring(1);
			System.out.print(s1+substring+" ");
		}
		
	}
	public static void main(String[] args)
	{
		String s="i love india";
		System.out.println("Orignal String is :"+s);
		System.out.println("-------------");
		ReplacefirstletterCapital(s);
	}

}
