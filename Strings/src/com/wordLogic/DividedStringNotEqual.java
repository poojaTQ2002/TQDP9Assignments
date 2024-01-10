package com.wordLogic;

import java.util.Arrays;

public class DividedStringNotEqual
{
	static void divideString(String s,int noOfC) 
	{
		int len=s.length();
		if(len%noOfC!=0)
		{
			int x=noOfC-(len%noOfC);
			for(int i=0;i<x;i++)
			{
				s=s.concat("#");
			}
			
		}
		
		len=s.length();
		//number of substring
			int n=len/noOfC;
			String splstr[]=new String[n];
			int index=0;
			for(int i=0;i<s.length();i+=noOfC)
			{
				splstr[index]=s.substring(i,i+noOfC);
				index++;
			}
			System.out.println(Arrays.toString(splstr));
		}

   public static void main(String[] args) 
   {
	  String arr[]= {"I","am","very","smart"};
	  String s1=String.join("", arr);
	  int noOfChars=5;
	  divideString(s1, noOfChars);
	  
   }
}
