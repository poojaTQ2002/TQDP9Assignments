package com.Basics;

public class CreateString 
{
	public static void main(String[] args)
	{
		String s1="Hello";
		   String s2="Hello";
		   System.out.println(s1.hashCode());
		   System.out.println(s2.hashCode());
		   
		   String s3=new String("Hello");
		   String s4=new String("Hello");
		   
		   System.out.println(s3.hashCode());
		   System.out.println(s4.hashCode());
		   
		   //hashcode----> memory management reference of hello and not s3
		   //id of s1 and s3 is same and diffrent for s3
		   
	}
   
   
   
   
  
}
