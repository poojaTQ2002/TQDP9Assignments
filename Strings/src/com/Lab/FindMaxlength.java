package com.Lab;

public class FindMaxlength 
{
	static void findMaxLen(String s)
	{
		String str[]=s.split(" ");
		String maxWord="";
		int maxLength=0;
		for(String s1:str)
		{
			if(s1.length()>maxLength)
			{
				maxLength=s1.length();
				maxWord=s1;
			}
		}
		System.out.println(maxWord);
		
	}
   public static void main(String[] args) 
   {
	 String str="I Love Java Pragramming ";
	 findMaxLen(str);
	 
   }
}
