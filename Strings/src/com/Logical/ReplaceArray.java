package com.Logical;

import java.util.Scanner;

public class ReplaceArray 
{
	static String replaceDup(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='#';
				}
			}
		}
		st=new String(ch);
		return st;
	}
   public static void main(String[] args)
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a Word");
	  String s=sc.next();
	  System.out.println("Original :"+s);
	  System.out.println("New :"+replaceDup(s));
	  
   }
}
