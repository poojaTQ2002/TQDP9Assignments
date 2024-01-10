package com.Logic;

public class StringDemo
{
	static void sumOfString(String s)
	{
		int sum=0;
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{ 
			if(ch[i]>'0'|| ch[i]<'9')
			{
				sum=sum+ch[i];
			}
        }
		System.out.println(sum);
			
		
	}
	public static void main(String[] args)
	{
		String s="Java123";
		sumOfString(s);
		
	}
    
    
}
