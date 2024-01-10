package com.StringAssignments2;
//26.Write a Java program to find highest frequency character in a string.

public class FindHighFrequencyQ26
{
	static void finhHighestFreq(String s)
	{
		int highfreq=0;
		int i,freq;
		for(i=0;i<s.length();i++)
		{
			freq=findFreq(s,s.charAt(i));
			if(highfreq<freq)
			{
				highfreq=freq;
			}
		}
		for(i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(ch1!=' ')
			{
				freq=findFreq(s,ch1);
				if(freq==highfreq)
				{
					System.out.println(ch1);
				}
				s=s.replace(ch1,' ');
			}
		}
	}
	static  int findFreq(String s,char ch)
	{
		int count=0;
		int i,j;
		for(i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
   public static void main(String[] args) 
   {
	   String s="abbcccddddeeeefffff";
	   System.out.println("Count is :"+findFreq(s,'f'));
	   //findFreq(s, 'e');
	   finhHighestFreq(s);
	   
   }
}
